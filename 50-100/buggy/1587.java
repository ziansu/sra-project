@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
java.lang.String post(java.lang.String resource, java.lang.Object definitionResponseModel) {
    org.junit.Assert.assertEquals("Post method not called with correct resource string", resource, java.lang.String.format(AzureLoadBalancerSupport.RESOURCE_DEFINITIONS, LOAD_BALANCER_ID));
    org.junit.Assert.assertEquals("Server not removed from the policy definition", ((org.dasein.cloud.azure.network.model.DefinitionModel) (definitionResponseModel)).getPolicy().getEndPoints().size(), 1);
    org.junit.Assert.assertEquals("A server with the wrong id has been removed", ((org.dasein.cloud.azure.network.model.DefinitionModel) (definitionResponseModel)).getPolicy().getEndPoints().get(0).getDomainName(), "endpoint1.cloudapp.net");
    return "test";
}