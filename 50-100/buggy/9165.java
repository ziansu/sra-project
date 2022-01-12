public void onMessage(com.solacesystems.conn.Handle handle) {
    com.solacesystems.conn.MessageSupport ms = ((com.solacesystems.conn.MessageSupport) (handle));
    com.solacesystems.conn.MessageHandle msg = ms.getRxMessage();
    java.lang.String topic = msg.getDestination().getName();
    java.nio.ByteBuffer container = handler.getBuffer();
    container.clear();
    msg.getBinaryAttachment(container);
    container.flip();
    handler.onMessage(topic, container);
}