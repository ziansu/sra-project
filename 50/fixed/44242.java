private void init() {
    inputStream.mark(bodyLengthBytes);
    bodyBytesRead = 0;
    serializeAndCacheHeaders();
}