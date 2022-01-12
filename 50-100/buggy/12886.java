public org.apache.cassandra.db.RowIndexEntry<org.apache.cassandra.io.sstable.IndexInfo> deserializeForCache(org.apache.cassandra.io.util.DataInputPlus in) throws java.io.IOException {
    assert version.storeRows();
    long position = in.readUnsignedVInt();
    switch (in.readByte()) {
        case org.apache.cassandra.db.RowIndexEntry.CACHE_NOT_INDEXED :
            return new org.apache.cassandra.db.RowIndexEntry<>(position);
        case org.apache.cassandra.db.RowIndexEntry.CACHE_INDEXED :
            return new org.apache.cassandra.db.RowIndexEntry.IndexedEntry(position, in, idxInfoSerializer, version, true);
        case org.apache.cassandra.db.RowIndexEntry.CACHE_INDEXED_SHALLOW :
            return new org.apache.cassandra.db.RowIndexEntry.ShallowIndexedEntry(position, in, idxInfoSerializer);
        default :
            throw new java.lang.AssertionError();
    }
}