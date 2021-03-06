package com.taobao.csp.sentinel.dashboard.rule.zookeeper;

import com.taobao.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.taobao.csp.sentinel.dashboard.rule.DynamicRuleZookeeperProvider;
import org.apache.curator.framework.CuratorFramework;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version Revision: 0.0.1
 * @author: weihuang.peng
 * @Date: 2018-12-22
 */
public class DegradeRuleZookeeperProvider implements DynamicRuleZookeeperProvider<DegradeRuleEntity> {

    @Autowired
    private CuratorFramework client;

    public static final String PATH = "/sentinel/rules/%s/degrade";

    @Override
    public String getPathFormat() {
        return PATH;
    }

    @Override
    public CuratorFramework getClient() {
        return client;
    }

    @Override
    public Class<DegradeRuleEntity> getTClass() {
        return DegradeRuleEntity.class;
    }
}
