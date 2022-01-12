@java.lang.Override
@org.junit.After
public void tearDown() throws java.lang.Exception {
    org.elasticsearch.cluster.settings.DynamicSettings dynamicSettings = ((org.elasticsearch.node.internal.InternalNode) (node())).injector().getInstance(org.elasticsearch.common.inject.Key.get(org.elasticsearch.cluster.settings.DynamicSettings.class, org.elasticsearch.cluster.settings.ClusterDynamicSettings.class));
    dynamicSettings.addDynamicSetting("cluster_id");
    client().admin().cluster().prepareUpdateSettings().setTransientSettingsToRemove(com.google.common.collect.Sets.newHashSet("cluster_id")).execute().actionGet();
    super.tearDown();
}