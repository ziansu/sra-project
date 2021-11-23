public static java.nio.ByteBuffer enlargeBuffer(java.nio.ByteBuffer buffer, int proposedCapacity) {
    if (proposedCapacity > (buffer.capacity())) {
        buffer = java.nio.ByteBuffer.allocate(proposedCapacity);
    }else {
        buffer = java.nio.ByteBuffer.allocate(((buffer.capacity()) * 2));
    }
    return buffer;
}