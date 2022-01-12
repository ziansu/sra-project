private java.lang.String toString(java.nio.ByteBuffer buffer) {
    int offset = buffer.arrayOffset();
    byte[] source = buffer.array();
    int length = (source.length) - offset;
    return new java.lang.String(source, offset, length);
}