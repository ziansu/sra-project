private static Chat.Builder buildMockChat() {
    java.util.Random random = new java.util.Random();
    sjchat.messages.Chat.Builder chatBuilder = sjchat.messages.Chat.newBuilder();
    chatBuilder.setId(null);
    chatBuilder.setTitle(("Test chat " + (chatBuilder.getId())));
    return chatBuilder;
}