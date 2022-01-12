public static synchronized org.xerial.snappy.buffer.CachedBufferAllocator getAllocator(int bufferSize) {
    org.xerial.snappy.buffer.CachedBufferAllocator result = null;
    if (org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.containsKey(bufferSize)) {
        result = org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.get(bufferSize).get();
    }
    if (result == null) {
        result = new org.xerial.snappy.buffer.CachedBufferAllocator(bufferSize);
        org.xerial.snappy.buffer.CachedBufferAllocator.queueTable.put(bufferSize, new java.lang.ref.SoftReference<org.xerial.snappy.buffer.CachedBufferAllocator>(result));
    }
    return result;
}