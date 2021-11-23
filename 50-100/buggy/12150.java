@org.testng.annotations.Test(dataProvider = "noHeadersNorDomainDataProvider", expectedExceptions = java.lang.IllegalStateException.class)
public void testGetZoneNoHeaderOrBase(final java.lang.String requestHostname, final java.lang.String requestHeader, final java.util.List<java.lang.String> serviceBaseDomains, final java.util.List<java.lang.String> serviceConfigHeaders, final java.lang.String headerValue, final java.lang.String subdomainValue) {
    org.springframework.mock.web.MockHttpServletRequest req = new org.springframework.mock.web.MockHttpServletRequest();
    req.setServerName(requestHostname);
    req.addHeader(requestHeader, headerValue);
    java.lang.String subdomain = com.ge.predix.uaa.token.lib.HttpServletRequestUtil.getZoneName(req, serviceBaseDomains, serviceConfigHeaders);
}