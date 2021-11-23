@java.lang.Override
@org.junit.After
public void tearDown() throws java.lang.Exception {
    org.elasticsearch.cluster.settings.DynamicSettings dynamicSettings = node().injector().getInstance(org.elasticsearch.common.inject.Key.get(org.elasticsearch.cluster.settings.DynamicSettings.class, org.elasticsearch.cluster.settings.ClusterDynamicSettings.class));
    client().admin().cluster().prepareUpdateSettings().execute().actionGet();
    super.tearDown();
}