@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
java.lang.String invoke(java.lang.String expectedMethod, java.lang.String expectedAccount, java.lang.String expectedResource, java.lang.String expectedBody) {
    org.junit.Assert.assertEquals(expectedMethod, "DELETE");
    org.junit.Assert.assertEquals(expectedAccount, ACCOUNT_NO);
    org.junit.Assert.assertEquals(expectedResource, java.lang.String.format(AzureLoadBalancerSupport.RESOURCE_PROFILE, LOAD_BALANCER_ID));
    org.junit.Assert.assertEquals(expectedBody, null);
    return "test";
}