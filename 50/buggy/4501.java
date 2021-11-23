@org.junit.Test
public void testMessageMLWithProlog() throws java.io.IOException {
    java.lang.String rawMessage = org.symphonyoss.integration.webhook.WebHookIntegrationTest.XML_WITH_PROLOG;
    java.lang.String expected = org.symphonyoss.integration.webhook.WebHookIntegrationTest.VALID_MESSAGEML;
    org.symphonyoss.integration.model.message.Message result = mockWHI.buildMessageML(rawMessage, "");
    org.junit.Assert.assertEquals(expected, result.getMessage());
}