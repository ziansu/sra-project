private static Message.Builder buildMockMessage() {
    java.util.Random random = new java.util.Random();
    sjchat.messages.Message.Builder messageBuilder = sjchat.messages.Message.newBuilder();
    messageBuilder.setId(java.lang.Math.abs(random.nextInt(100)));
    messageBuilder.setMessage(("Test message " + (messageBuilder.getId())));
    messageBuilder.setUser("user-uuid");
    return messageBuilder;
}