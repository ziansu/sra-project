public boolean writeToSocket(org.java_websocket.WebSocket socket, Messaging.ChimeMessage chimeMessage) {
    try {
        socket.send(java.nio.ByteBuffer.wrap(gson.toJson(chimeMessage).toString().getBytes()));
        logger.info(java.lang.String.format("Successfully wrote message to %s", socket.toString()));
        return true;
    } catch (java.lang.Exception e) {
        logger.error(e.toString());
        return false;
    }
}