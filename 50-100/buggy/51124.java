@org.junit.Test
public void testInputUriNotEmptyAndMatchesCatalogUri() throws ddf.catalog.plugin.StopProcessingException, java.net.URISyntaxException {
    ddf.catalog.plugin.PolicyPlugin policyPlugin = getPolicyPlugin("sampleURI", new java.lang.String[]{ "role=admin" , "fizzle=bang" }, new java.lang.String[]{ "role=admin" , "fizzle=bang" });
    ddf.catalog.plugin.PolicyResponse response = policyPlugin.processPreUpdate(getMockMetacard("sampleURI"), null);
    assertEmptyResponse("If metacard has resource URI and it matches update resource URI, no policy is needed", response);
}