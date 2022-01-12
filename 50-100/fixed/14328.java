private void storeAndSwapBuffer() throws java.io.IOException {
    if ((readyToWriteBuf) != null) {
        storage.store(fileNameStrategy.getFileName(part), new java.io.ByteArrayInputStream(readyToWriteBuf));
        ++(part);
    }
    readyToWriteBuf = buf;
    buf = new byte[partSize];
    pos = 0;
}