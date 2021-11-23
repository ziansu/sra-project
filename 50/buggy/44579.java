public void sendFrame(org.fusesource.mqtt.codec.MQTTFrame frame) throws java.lang.Exception {
    checkConnected();
    org.apache.activemq.util.ByteSequence payload = wireFormat.marshal(frame);
    connection.getRemote().sendBytes(java.nio.ByteBuffer.wrap(payload.data));
}