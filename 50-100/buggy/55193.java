public void sendMessage(java.nio.channels.SocketChannel source, jauhararifin.common.buffer.Buffer message) {
    if (source == null)
        throw new java.lang.NullPointerException("Source channel cannot null");
    
    if (message == null)
        throw new java.lang.NullPointerException("Message cannot null");
    
    gondes.dev.club.sinau.server.ServerWriter.logger.debug(((("Sending message : " + source) + " -> ") + (java.util.Base64.getEncoder().encodeToString(message.array()))));
    this.messageQueue.add(new java.util.AbstractMap.SimpleImmutableEntry<java.nio.channels.SocketChannel, jauhararifin.common.buffer.Buffer>(source, message));
}