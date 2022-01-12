private java.nio.ByteBuffer allocateBuffer(final int requestedCapacity) {
    int allocateCapacity = requestedCapacity;
    if (allocateCapacity < (currentAllocateCapacity)) {
        allocateCapacity = (currentAllocateCapacity) * (org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.NEW_BUFFER_RESIZE_FACTOR);
    }
    if (allocateCapacity > (org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY)) {
        allocateCapacity = org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY;
    }
    currentAllocateCapacity = allocateCapacity;
    return java.nio.ByteBuffer.allocate(allocateCapacity);
}