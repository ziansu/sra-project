@org.testng.annotations.Test(dataProvider = "domainDataProvider")
public void testGetZoneName(final java.lang.String requestHostname, final java.util.List<java.lang.String> serviceBaseDomains, final java.util.List<java.lang.String> serviceConfigHeaders, final java.lang.String subdomainValue) {
    org.springframework.mock.web.MockHttpServletRequest req = new org.springframework.mock.web.MockHttpServletRequest();
    req.setServerName(requestHostname);
    java.lang.String subdomain = com.ge.predix.uaa.token.lib.HttpServletRequestUtil.getZoneName(req, serviceBaseDomains, serviceConfigHeaders);
    org.testng.Assert.assertEquals(subdomain, subdomainValue);
}