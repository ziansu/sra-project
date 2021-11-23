private static void writeMessage(java.nio.ByteBuffer buffer, kafka.message.Message message, java.lang.Long offset) {
    buffer.putLong(offset);
    buffer.putInt(message.size());
    buffer.put(message.buffer);
    message.buffer.rewind();
}