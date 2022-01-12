public synchronized void reset(int length) {
    while (!(getFullBuffers().isEmpty())) {
        java.nio.ByteBuffer byteBuffer = getFullBuffers().poll();
        if (null != byteBuffer) {
            byteBuffer.clear();
            getEmptyBuffers().add(byteBuffer);
        }
    } 
    setTotalSize(length);
    setPosition(0);
    executorService.execute(new info.novatec.inspectit.storage.nio.stream.SocketExtendedByteBufferInputStream.SocketReadRunnable());
}