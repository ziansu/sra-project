public int localDeletionTime() {
    return org.apache.cassandra.utils.memory.MemoryUtil.getInt(((peer) + (org.apache.cassandra.db.rows.NativeCell.DELETION)));
}