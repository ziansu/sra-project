private void loadDataToRetentionBuffers(java.lang.String tag, java.nio.ByteBuffer src) throws java.io.IOException {
    synchronized(retentionBuffers) {
        org.komamitsu.fluency.buffer.PackedForwardBuffer.RetentionBuffer buffer = prepareBuffer(tag, src.remaining());
        buffer.getByteBuffer().put(src);
        moveRetentionBufferIfNeeded(tag, buffer);
    }
}