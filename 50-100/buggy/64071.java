public void writeBinaryLong(long data) {
    try {
        buffer = java.nio.ByteBuffer.allocate(4);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(((int) (data)));
        buffer.rewind();
        channel.write(buffer);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}