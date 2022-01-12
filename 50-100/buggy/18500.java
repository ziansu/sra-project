public byte[] getAuthenticationData(final java.nio.ByteBuffer buffer, final java.lang.String key) {
    byte[] bufferAsArray;
    if (buffer.hasArray()) {
        bufferAsArray = buffer.array();
    }else {
        bufferAsArray = new byte[buffer.limit()];
    }
    return getAuthenticationData(bufferAsArray, key);
}