@org.testng.annotations.Test(groups = "wso2.esb")
public void testRetrieveBackendServiceWsdl() throws java.lang.Exception {
    org.apache.axiom.om.OMElement result = httpClientUtil.get(backendWSDLUrl);
    org.testng.Assert.assertTrue(result.toString().contains("SimpleStockQuoteService"), "Failed to receive service WSDL, Named SimpleStockQuoteService");
}