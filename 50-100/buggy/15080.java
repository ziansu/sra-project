@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
java.lang.String post(java.lang.String resource, java.lang.Object definitionResponseModel) {
    org.junit.Assert.assertEquals("Post method not called with correct resource string", resource, java.lang.String.format(AzureLoadBalancerSupport.RESOURCE_DEFINITIONS, LOAD_BALANCER_ID));
    org.junit.Assert.assertEquals("New server not added to the policy definition", ((org.dasein.cloud.azure.network.model.DefinitionModel) (definitionResponseModel)).getPolicy().getEndPoints().size(), 2);
    return "test";
}