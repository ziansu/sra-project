private void storeAndSwapBuffer() throws java.io.IOException {
    if ((readyToWriteBuf) != null) {
        storage.store(fileNameStrategy.getFileName(part), new java.io.ByteArrayInputStream(readyToWriteBuf));
    }
    readyToWriteBuf = buf;
    buf = new byte[partSize];
    ++(part);
    pos = 0;
}