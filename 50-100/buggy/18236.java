@java.lang.Override
public void writeTo(java.nio.ByteBuffer buffer) {
    try {
        buffer.limit(((entrySize) + (org.apache.kafka.common.record.Records.LOG_OVERHEAD)));
        buffer.putLong(offset);
        buffer.putInt(entrySize);
        org.apache.kafka.common.utils.Utils.readFully(channel, buffer, position);
    } catch (java.io.IOException e) {
        throw new org.apache.kafka.common.KafkaException(((("Failed to read log entry at position " + (position)) + " from file channel ") + (channel)), e);
    }
}