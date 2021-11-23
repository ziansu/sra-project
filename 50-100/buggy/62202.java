@org.wso2.carbon.automation.engine.annotations.SetEnvironment(executionEnvironments = { org.wso2.carbon.automation.engine.annotations.ExecutionEnvironment.STANDALONE })
@org.testng.annotations.Test(groups = { "wso2.esb" }, description = "Creating simple cache sample 420 Test Case")
public void testSimpleCachingExists() throws java.lang.InterruptedException, javax.xml.xpath.XPathExpressionException, org.apache.axis2.AxisFault {
    org.apache.axiom.om.OMElement response;
    response = axis2Client.sendSimpleStockQuoteRequest(getMainSequenceURL(), "", "IBM");
    java.lang.String firstResponse = response.getFirstElement().toString();
    response = axis2Client.sendSimpleStockQuoteRequest(getMainSequenceURL(), "", "IBM");
    if (firstResponse.equalsIgnoreCase(response.getFirstElement().toString())) {
        org.testng.Assert.assertTrue(true, "Caching is less than 20 seconds");
    }
}