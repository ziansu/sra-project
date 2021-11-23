public static java.lang.String initConversation() {
    client.Conversation.context = null;
    java.lang.String response = client.Conversation.sendRequest("");
    return response;
}