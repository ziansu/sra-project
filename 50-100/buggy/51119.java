@org.testng.annotations.Test(description = "Test get configuration.", dependsOnMethods = { "testSaveConfiguration" })
public void testGetConfiguration() throws java.lang.Exception {
    org.wso2.mdm.integration.configuration.MDMResponse response = client.get(Constants.ConfigurationManagement.CONFIGURATION_ENDPOINT);
    junit.framework.Assert.assertEquals(HttpStatus.SC_OK, response.getStatus());
    org.wso2.mdm.integration.configuration.AssertUtil.jsonPayloadCompare(org.wso2.mdm.integration.configuration.PayloadGenerator.getJsonPayload(Constants.ConfigurationManagement.CONFIGURATION_RESPONSE_PAYLOAD_FILE_NAME, Constants.HTTP_METHOD_GET).toString(), response.getBody(), true);
}