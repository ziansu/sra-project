@org.testng.annotations.Test(dependsOnMethods = { "testCreateCatalog" })
public void testGetCatalogs() {
    java.lang.String catalog = "catalogTest";
    MetadataManagerTestHelper.HELPER.createTestCatalog(catalog);
    java.util.List<com.stratio.crossdata.common.metadata.CatalogMetadata> catalogs = MetadataManager.MANAGER.getCatalogs();
    int expectedNumber = 7;
    org.testng.Assert.assertTrue(((catalogs.size()) == expectedNumber), (((((("Catalogs size is wrong." + (java.lang.System.lineSeparator())) + "Expected: ") + expectedNumber) + (java.lang.System.lineSeparator())) + "Found:    ") + (catalogs.size())));
}