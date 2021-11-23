public static java.lang.String initConversation() {
    client.Conversation.context = null;
    java.lang.String response = client.Conversation.sendRequest("");
    java.lang.System.out.println(response);
    return response;
}