@org.testng.annotations.Test(description = "InternalUrl service endpoints loader")
public void testGetInternalUrlServiceEndpoint() throws java.lang.Exception {
    java.lang.String region = api.getConfiguredRegions().iterator().next();
    try {
        org.testng.Assert.assertNotNull(api.getServerApi(region).list().concat().toList());
    } catch (java.lang.Exception e) {
        org.testng.Assert.fail("Could not retrieve servers list using the internalUrl", e);
    }
}