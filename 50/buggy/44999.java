@org.dasein.cloud.azure.tests.network.Mock(invocations = 1)
void $init(org.dasein.cloud.azure.Azure provider) {
    org.junit.Assert.assertEquals(provider, azureMock);
}