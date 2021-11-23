private java.nio.ByteBuffer allocateBuffer(final int requestedCapacity) {
    if (requestedCapacity > (org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY)) {
        currentAllocateCapacity = org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY;
        return java.nio.ByteBuffer.allocate(requestedCapacity);
    }
    if (requestedCapacity <= (currentAllocateCapacity)) {
        currentAllocateCapacity *= org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.NEW_BUFFER_RESIZE_FACTOR;
        if ((currentAllocateCapacity) > (org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY)) {
            currentAllocateCapacity = org.apache.olingo.odata2.core.ep.util.CircleStreamBuffer.MAX_CAPACITY;
        }
    }else {
        currentAllocateCapacity = requestedCapacity;
    }
    return java.nio.ByteBuffer.allocate(currentAllocateCapacity);
}