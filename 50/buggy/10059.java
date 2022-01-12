@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
<T> T get(java.lang.Class<T> model, java.lang.String resource) {
    org.junit.Assert.assertEquals("AzureMethod#get method not called with correct resource parameter", expectdResource, resource);
    org.junit.Assert.assertEquals("Incorrect type passed in for model", expectedClassz, model);
    return null;
}