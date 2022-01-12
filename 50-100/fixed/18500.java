public byte[] getAuthenticationData(final java.nio.ByteBuffer buffer, final java.lang.String key) {
    byte[] bufferAsArray;
    if (buffer.hasArray()) {
        bufferAsArray = buffer.array();
    }else {
        buffer.position(0);
        bufferAsArray = new byte[buffer.limit()];
        buffer.get(bufferAsArray);
    }
    return getAuthenticationData(bufferAsArray, key);
}