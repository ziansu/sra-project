public long timestamp() {
    if ((peer) == 0)
        throw new java.lang.IllegalStateException();
    
    return org.apache.cassandra.utils.memory.MemoryUtil.getLong(((peer) + (org.apache.cassandra.db.rows.NativeCell.TIMESTAMP)));
}