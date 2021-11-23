@org.junit.After
public void destroy() throws java.io.IOException, java.net.URISyntaxException {
    com.teamdev.RequestMethods.removeChat(validToken, registeredChatId);
    com.teamdev.RequestMethods.removeUser(validToken, registeredUserId.id);
}