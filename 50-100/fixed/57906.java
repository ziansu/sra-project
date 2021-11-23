public long getKeyVersionNo(java.lang.String inKSName, java.nio.ByteBuffer inKey) {
    long version = -1;
    java.util.concurrent.atomic.AtomicLong atomicLong = m_versionMaps.get(inKSName, inKey);
    if (atomicLong == null) {
        m_versionMaps.put(inKSName, inKey, new java.util.concurrent.atomic.AtomicLong(0));
        version = 0;
    }else {
        version = atomicLong.incrementAndGet();
    }
    return version;
}