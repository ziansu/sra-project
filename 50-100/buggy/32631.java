private byte[] asByteArray(java.nio.ByteBuffer buffer) {
    buffer.rewind();
    byte[] data = new byte[(buffer.limit()) - (buffer.position())];
    for (int i = 0; i < (data.length); i++) {
        data[i] = buffer.get(i);
    }
    return data;
}