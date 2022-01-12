private void bulkloadRefFile(org.apache.hadoop.hbase.client.Connection connection, org.apache.hadoop.hbase.client.Table table, org.apache.hadoop.fs.Path bulkloadDirectory, java.lang.String fileName) throws java.io.IOException {
    try {
        org.apache.hadoop.hbase.mapreduce.LoadIncrementalHFiles bulkload = new org.apache.hadoop.hbase.mapreduce.LoadIncrementalHFiles(conf);
        bulkload.doBulkLoad(bulkloadDirectory, connection.getAdmin(), table, connection.getRegionLocator(table.getName()));
    } catch (java.lang.Exception e) {
        throw new java.io.IOException(e);
    }
}