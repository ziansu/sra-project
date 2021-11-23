private static Chat.Builder buildMockChat() {
    java.util.Random random = new java.util.Random();
    sjchat.messages.Chat.Builder chatBuilder = sjchat.messages.Chat.newBuilder();
    chatBuilder.setId(java.lang.Math.abs(random.nextInt(100)));
    chatBuilder.setTitle(("Test chat " + (chatBuilder.getId())));
    return chatBuilder;
}