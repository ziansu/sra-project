@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
java.lang.String invoke(java.lang.String expectedMethod, java.lang.String expectedAccount, java.lang.String expectedResource, java.lang.String expectedBody) {
    assertEquals(expectedMethod, "DELETE");
    assertEquals(expectedAccount, ACCOUNT_NO);
    assertEquals(expectedResource, java.lang.String.format(AzureLoadBalancerSupport.RESOURCE_PROFILE, LOAD_BALANCER_ID));
    assertEquals(expectedBody, null);
    return "test";
}