private void auxAllocateAndAdjustFields(long auxAddress, long oldCapacity, long newCapacity) {
    try {
        allocateArrayAndAdjustFields(size(), newCapacity);
    } catch (java.lang.Error e) {
        try {
            baseAddress = move(auxAddress, oldCapacity, auxMalloc, malloc);
        } catch (java.lang.Error e1) {
            baseAddress = com.hazelcast.memory.MemoryAllocator.NULL_ADDRESS;
        }
        throw e;
    }
}