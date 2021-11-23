@java.lang.Override
public void writeTo(java.nio.ByteBuffer buffer) {
    try {
        org.apache.kafka.common.utils.Utils.readFully(channel, buffer, position);
    } catch (java.io.IOException e) {
        throw new org.apache.kafka.common.KafkaException(((("Failed to read log entry at position " + (position)) + " from file channel ") + (channel)), e);
    }
}