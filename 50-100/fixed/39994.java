public static java.util.List<com.jfastnet.messages.MessagePart> createFromMessage(com.jfastnet.Config config, long id, com.jfastnet.messages.Message message, int chunkSize, com.jfastnet.messages.ReliableMode reliableMode) {
    config.udpPeer.createPayload(message);
    if ((message.payload) instanceof byte[]) {
        byte[] bytes = ((byte[]) (message.payload));
        if (config.compressBigMessages) {
            bytes = com.jfastnet.messages.MessagePart.compress(bytes);
        }
        return com.jfastnet.messages.MessagePart.createFromByteArray(id, bytes, chunkSize, reliableMode);
    }
    log.error("Message could not be created, because of missing byte array payload.");
    return null;
}