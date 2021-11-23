private void processPublish(java.lang.String clientID, java.lang.String topic, org.eclipse.moquette.proto.messages.AbstractMessage.QOSType qos, java.nio.ByteBuffer message, boolean retain, java.lang.Integer messageID) {
    org.eclipse.moquette.spi.impl.ProtocolProcessor.LOG.info("PUBLISH from clientID [{}] on topic [{}] with QoS [{}]", clientID, topic, qos);
    forward2Subscribers(topic, qos, message, retain, messageID);
}