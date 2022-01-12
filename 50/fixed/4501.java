@org.junit.Test
public void testMessageMLWithProlog() throws java.io.IOException {
    org.symphonyoss.integration.model.message.Message result = mockWHI.buildMessageML(org.symphonyoss.integration.webhook.WebHookIntegrationTest.XML_WITH_PROLOG, "");
    org.junit.Assert.assertNotNull(result);
    org.junit.Assert.assertEquals(org.symphonyoss.integration.webhook.WebHookIntegrationTest.VALID_MESSAGEML, result.getMessage());
}