@org.junit.Test
public void testSendPrivateMessage() throws java.io.IOException, java.net.URISyntaxException {
    org.apache.http.HttpResponse response = com.teamdev.RequestMethods.sendPrivateMessage(validToken, "testMessage", registeredUserId.id, registeredChatId.id, registeredUserId.id);
    assertEquals("response status must be 200", 200, response.getStatusLine().getStatusCode());
}