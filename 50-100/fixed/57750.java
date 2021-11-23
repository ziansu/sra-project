public java.nio.ByteBuffer getByteBuffer(int size) {
    if (((byteBuffer.position()) + size) > (limit)) {
        throw new org.terracotta.runnel.utils.BufferLimitReachedException();
    }
    java.nio.ByteBuffer slice = byteBuffer.slice();
    slice.limit(size);
    byteBuffer.position(((byteBuffer.position()) + size));
    return slice;
}