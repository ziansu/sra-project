private void validateMobColumnFamily(org.apache.hadoop.hbase.TableName tableName, byte[] columnFamily) throws java.io.IOException {
    org.apache.hadoop.hbase.HTableDescriptor htd = getTableDescriptor(tableName);
    org.apache.hadoop.hbase.HColumnDescriptor family = htd.getFamily(columnFamily);
    if ((family == null) || (!(family.isMobEnabled()))) {
        throw new java.lang.IllegalArgumentException((("Column family " + (org.apache.hadoop.hbase.util.Bytes.toString(columnFamily))) + " is not a mob column family"));
    }
}