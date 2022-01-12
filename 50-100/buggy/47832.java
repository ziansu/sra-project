private int readBytes(byte[] b, int off, int len) throws java.io.IOException {
    if (((currentBufferLength) - (currentBufferPosition)) == 0) {
        nextBuffer();
    }
    int bytesRead = currentBuffer.read(b, off, len);
    currentBufferPosition += bytesRead;
    currentPosition += bytesRead;
    return bytesRead;
}