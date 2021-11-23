public static java.nio.ByteBuffer readSizedBytes(java.nio.ByteBuffer buffer) {
    int messageSize = buffer.getInt();
    java.nio.ByteBuffer messageBuffer = buffer.slice();
    messageBuffer.limit(messageSize);
    buffer.position(((buffer.position()) + messageSize));
    return messageBuffer;
}