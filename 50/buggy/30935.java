@java.lang.Override
public com.orientechnologies.orient.core.index.engine.OIndexCursor iterateEntriesMinor(java.lang.Object toKey, boolean isInclusive, boolean ascSortOrder, com.orientechnologies.orient.core.index.engine.ValuesTransformer transformer) {
    acquireSharedLock();
    try {
        return new com.orientechnologies.orient.core.index.engine.OSBTreeIndexEngine.OSBTreeIndexCursor(sbTree.iterateEntriesMinor(toKey, isInclusive, ascSortOrder), transformer);
    } finally {
        releaseSharedLock();
    }
}