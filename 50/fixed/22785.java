@org.junit.AfterClass
public static void cleanUp() throws java.lang.Exception {
    if ((org.apache.coheigea.bigdata.solr.SolrCloudTest.server) != null) {
        org.apache.coheigea.bigdata.solr.SolrCloudTest.server.shutdown();
    }
    org.apache.coheigea.bigdata.solr.SolrCloudTest.tempDir.toFile().deleteOnExit();
}