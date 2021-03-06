@java.lang.Override
public void encodeRest(final org.apache.activemq.artemis.api.core.ActiveMQBuffer buffer) {
    buffer.writeLong(consumerID);
    buffer.writeInt(deliveryCount);
    buffer.writeLong(largeMessageSize);
    if ((message) != null) {
        message.encodeHeadersAndProperties(buffer);
    }
}