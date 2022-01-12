public static synchronized org.xerial.snappy.buffer.CachedBufferAllocator getAllocator(int bufferSize) {
    if (!(org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.containsKey(bufferSize))) {
        org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.put(bufferSize, new java.lang.ref.SoftReference<org.xerial.snappy.buffer.CachedBufferAllocator>(new org.xerial.snappy.buffer.CachedBufferAllocator(bufferSize)));
    }
    return org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.get(bufferSize).get();
}