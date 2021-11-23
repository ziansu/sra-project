@org.junit.AfterClass
public static void cleanUp() throws java.lang.Exception {
    org.apache.coheigea.bigdata.solr.SolrCloudTest.server.shutdown();
    org.apache.coheigea.bigdata.solr.SolrCloudTest.tempDir.toFile().deleteOnExit();
}