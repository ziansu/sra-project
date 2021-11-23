@org.testng.annotations.Test
public void testCreateCatalog() throws java.lang.Exception {
    com.stratio.crossdata.common.data.DataStoreName dataStoreRef = createTestDatastore();
    com.stratio.crossdata.common.data.ClusterName clusterName = new com.stratio.crossdata.common.data.ClusterName("clusterTest");
    createTestCluster(clusterName.getName(), dataStoreRef);
    com.stratio.crossdata.common.data.CatalogName catalogName = createTestCatalog("testCatalog").getName();
    org.testng.Assert.assertEquals(MetadataManager.MANAGER.getCatalog(catalogName).getName(), catalogName, (((("Expected: " + catalogName) + (java.lang.System.lineSeparator())) + "Found:    ") + (MetadataManager.MANAGER.getCatalog(catalogName).getName())));
}