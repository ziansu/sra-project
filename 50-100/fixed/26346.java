public org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.PostgresTable postgresTableFromPartition(java.lang.String dbName, java.lang.String tableName) throws java.sql.SQLException {
    org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.PostgresTable pTable = new org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.PostgresTable(org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.buildPartTableName(dbName, tableName));
    org.apache.hadoop.hive.metastore.api.Table hTable = getTable(dbName, tableName);
    for (org.apache.hadoop.hive.metastore.api.FieldSchema fs : hTable.getPartitionKeys()) {
        pTable.addColumn(fs, true);
    }
    pTable.addByteColumn(org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.CATALOG_COL).addByteColumn(org.apache.hadoop.hive.metastore.sqlbin.PostgresKeyValue.STATS_COL);
    return pTable;
}