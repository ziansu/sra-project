private void writeHeader(byte[] iv) throws java.io.IOException {
    int ivLength = iv.length;
    java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate((ivLength + 1));
    buf.put(((byte) (ivLength)));
    buf.put(iv);
    buf.flip();
    channel.write(buf);
}