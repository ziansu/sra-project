@org.elasticsearch.test.AfterClass
public static void afterClass() throws java.lang.Exception {
    if (!(org.elasticsearch.test.ElasticsearchIntegrationTest.runTestScopeLifecycle())) {
        try {
            org.elasticsearch.test.ElasticsearchIntegrationTest.INSTANCE.afterInternal(true);
        } finally {
            org.elasticsearch.test.ElasticsearchIntegrationTest.INSTANCE = null;
        }
    }else {
        org.elasticsearch.test.ElasticsearchIntegrationTest.clearClusters();
    }
    org.elasticsearch.test.ElasticsearchIntegrationTest.SUITE_SEED = null;
    org.elasticsearch.test.ElasticsearchIntegrationTest.sharedDataInitialized = false;
}