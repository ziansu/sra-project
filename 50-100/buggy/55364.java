public org.apache.cassandra.db.UnfilteredPartitionIterator makeIterator(org.apache.cassandra.config.CFMetaData metadata, org.apache.cassandra.db.ReadCommand command) {
    try {
        org.apache.cassandra.io.util.DataInputPlus in = new org.apache.cassandra.io.util.DataInputBuffer(data, true);
        return org.apache.cassandra.db.UnfilteredPartitionIterators.serializerForIntraNode().deserialize(in, MessagingService.current_version, metadata, selection(command.columnFilter()), flag);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}