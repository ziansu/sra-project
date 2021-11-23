public static java.util.List<com.jfastnet.messages.MessagePart> createFromMessage(com.jfastnet.Config config, int id, com.jfastnet.messages.Message message, int chunkSize) {
    return com.jfastnet.messages.MessagePart.createFromMessage(config, id, message, chunkSize, message.getReliableMode());
}