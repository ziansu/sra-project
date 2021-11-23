@org.junit.Test
public void capabilitiesAreInitializesAndReturnCorrectly() throws org.dasein.cloud.CloudException, org.dasein.cloud.InternalException {
    org.dasein.cloud.azure.network.AzureLoadBalancerCapabilities capabilities = mockit.Deencapsulation.getField(lbSupport, "capabilities");
    org.dasein.cloud.azure.tests.network.LoadBalancerCapabilities acutalCapabilities = lbSupport.getCapabilities();
    org.dasein.cloud.CloudProvider provider = mockit.Deencapsulation.getField(capabilities, "provider");
    org.junit.Assert.assertEquals("azure capabilities initialized with incorrect provider", azureMock, provider);
    org.junit.Assert.assertEquals("getCapabilities doesn't return current capabilities", capabilities, acutalCapabilities);
}