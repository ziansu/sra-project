public long getKeyVersionNo(java.lang.String inKSName, java.nio.ByteBuffer inKey) {
    long version = -1;
    synchronized(m_versionMaplock) {
        java.lang.Long atomicLong = m_versionMaps.get(inKSName, inKey);
        if (atomicLong == null) {
            m_versionMaps.put(inKSName, inKey, 0L);
            version = 0;
        }else {
            version = ++atomicLong;
        }
    }
    return version;
}