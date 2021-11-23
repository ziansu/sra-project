private void prepareChunk() {
    bufferSize = java.lang.Math.min(BUFFER_SIZE, ((fileLength) - 1));
    try {
        final java.nio.ByteBuffer byteBuffer = channel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0, bufferSize);
        chunkChrBuf = textReader.TextReaderImpl.CHARSET.decode(byteBuffer);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}