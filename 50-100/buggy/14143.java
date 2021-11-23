private void clearAll(java.nio.channels.FileChannel channel, java.util.List<java.nio.MappedByteBuffer> buffers) {
    try {
        indexChannel.close();
    } catch (java.io.IOException ignored) {
    }
    for (java.nio.MappedByteBuffer buffer : buffers) {
        if (buffer instanceof sun.nio.ch.DirectBuffer)
            ((sun.nio.ch.DirectBuffer) (buffer)).cleaner().clean();
        
    }
    buffers.clear();
}