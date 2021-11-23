public int bufferPopArray(byte[] buffer, int read) throws java.io.IOException {
    int actualRead = java.lang.Math.min(read, bufferSize());
    if ((buffer.length) < actualRead) {
        throw new java.io.IOException("Passed buffer is too small");
    }
    java.lang.System.arraycopy(this.internalBuffer, bufferBegin, buffer, 0, actualRead);
    bufferBegin += actualRead;
    return actualRead;
}