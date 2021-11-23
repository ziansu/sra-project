public void writeBinaryInteger(int data) {
    try {
        buffer = java.nio.ByteBuffer.allocate(2);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        buffer.putShort(((short) (data)));
        buffer.rewind();
        channel.write(buffer);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}