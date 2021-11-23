@org.junit.Test
public void testThatDataServiceStartedGeoPackageStore() {
    boolean containsGeoPackageStore = false;
    com.boundlessgeo.spatialconnect.stores.SCDataStore gpkgStore = com.boundlessgeo.spatialconnect.test.GeoPackageTest.sc.getDataService().getStoreById(BaseTestCase.HAITI_GPKG_ID);
    junit.framework.Assert.assertTrue("The store's adapter should be connected.", gpkgStore.getAdapter().getStatus().equals(SCDataAdapterStatus.DATA_ADAPTER_CONNECTED));
    junit.framework.Assert.assertNotNull("The store should downloaded locally", gpkgStore);
    junit.framework.Assert.assertEquals("The store should be running", SCDataStoreStatus.SC_DATA_STORE_RUNNING, gpkgStore.getStatus());
}