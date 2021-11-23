public int read(final byte[] dstBytes, final int dstOffset, final int length) throws java.io.IOException {
    int bytesRead = -1;
    if ((position) < (this.length)) {
        bytesRead = java.lang.Math.min(length, available());
        buffer.getBytes(((offset) + (position)), dstBytes, dstOffset, bytesRead);
        position += bytesRead;
    }
    return bytesRead;
}