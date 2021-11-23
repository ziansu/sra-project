public void writeBinaryDouble(double data) {
    try {
        buffer = java.nio.ByteBuffer.allocate(8);
        buffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        buffer.putDouble(data);
        buffer.rewind();
        channel.write(buffer);
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.toString());
    }
}