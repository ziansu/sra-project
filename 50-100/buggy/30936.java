@org.junit.Test
public void testAssertWithInvalidPassword() throws java.lang.Exception {
    expectedMessages.add(HubProxyInfoBuilder.ERROR_MSG_CREDENTIALS_INVALID);
    final com.blackducksoftware.integration.hub.builder.HubProxyInfoBuilder builder = new com.blackducksoftware.integration.hub.builder.HubProxyInfoBuilder();
    builder.setHost(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_HOST);
    builder.setPort(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_PORT);
    builder.setUsername(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_USERNAME);
    builder.setPassword("");
    builder.setIgnoredProxyHosts(com.blackducksoftware.integration.hub.global.HubProxyInfoBuilderTest.VALID_IGNORE_HOST_LIST);
    final com.blackducksoftware.integration.hub.builder.ValidationResults<com.blackducksoftware.integration.hub.global.HubProxyInfoFieldEnum, com.blackducksoftware.integration.hub.global.HubProxyInfo> result = builder.assertValid();
    org.junit.Assert.assertFalse(result.isSuccess());
    actualMessages = getMessages(result);
}