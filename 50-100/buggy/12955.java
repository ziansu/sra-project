@org.junit.Test
public void testValidateCredentialsPasswordOnly() throws java.lang.Exception {
    expectedMessages.add(HubProxyInfoBuilder.ERROR_MSG_CREDENTIALS_INVALID);
    final com.blackducksoftware.integration.hub.builder.HubProxyInfoBuilder builder = new com.blackducksoftware.integration.hub.builder.HubProxyInfoBuilder();
    builder.setHost(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_HOST);
    builder.setUsername("");
    builder.setPassword(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_PASSWORD);
    final com.blackducksoftware.integration.hub.builder.ValidationResults<com.blackducksoftware.integration.hub.global.HubProxyInfoFieldEnum, com.blackducksoftware.integration.hub.global.HubProxyInfo> result = new com.blackducksoftware.integration.hub.builder.ValidationResults<com.blackducksoftware.integration.hub.global.HubProxyInfoFieldEnum, com.blackducksoftware.integration.hub.global.HubProxyInfo>();
    builder.validateCredentials(result);
    org.junit.Assert.assertFalse(result.isSuccess());
    actualMessages = getMessages(result);
}