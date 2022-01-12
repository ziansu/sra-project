public void negativeTests(org.voltdb.client.Client client) throws java.io.UnsupportedEncodingException {
    java.net.URL url = org.voltdb.regressionsuites.TestCatalogUpdateSuite.class.getResource("TestCatalogUpdateSuite.class");
    java.lang.String newCatalogURL = java.net.URLDecoder.decode(url.getPath(), "UTF-8");
    java.lang.String deploymentURL = org.voltdb.VoltDB.Configuration.getPathToCatalogForTest("catalogupdate-cluster-addtables.xml");
    try {
        client.updateApplicationCatalog(new java.io.File(newCatalogURL), new java.io.File(deploymentURL));
        fail();
    } catch (java.lang.Exception e) {
        assertTrue(e.getMessage().startsWith("Database catalog not found"));
    }
}