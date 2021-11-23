public int localDeletionTime() {
    if ((peer) == 0)
        throw new java.lang.IllegalStateException();
    
    return org.apache.cassandra.utils.memory.MemoryUtil.getInt(((peer) + (org.apache.cassandra.db.rows.NativeCell.DELETION)));
}