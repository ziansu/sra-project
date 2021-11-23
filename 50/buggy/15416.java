private java.lang.String getBufferName(int section) {
    return com.bagri.xdm.cache.hazelcast.store.MemoryMappedStore.buildSectionFileName(dataPath, nodeNum, "catalog", section);
}