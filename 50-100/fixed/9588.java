public void addCell(org.apache.cassandra.config.ColumnDefinition column, java.nio.ByteBuffer value, org.apache.cassandra.db.rows.LivenessInfo info) {
    int idx = columns.simpleIdx(column);
    if (idx < 0)
        throw new java.lang.RuntimeException(((("Cannot find column " + (column.name)) + " in ") + (columns)));
    
    idx += base;
    data.setCell(idx, value, info);
}