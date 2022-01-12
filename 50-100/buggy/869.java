private void updateColumn(org.apache.cassandra.config.ColumnDefinition c, com.scylladb.tools.SSTableToCQL.RowBuilder.ColumnOp object, long timestamp, int ttl) {
    assert !(values.containsKey(c));
    if (((object != null) && (object.canDoInsert())) && ((this.op) != (com.scylladb.tools.SSTableToCQL.RowBuilder.Op.UPDATE))) {
        setOp(com.scylladb.tools.SSTableToCQL.RowBuilder.Op.INSERT, timestamp, ttl);
    }else {
        setOp(com.scylladb.tools.SSTableToCQL.RowBuilder.Op.UPDATE, timestamp, ttl);
    }
    values.put(c, object);
}