public java.lang.Boolean[] exists(java.util.List<org.apache.hadoop.hbase.client.Get> gets) throws java.io.IOException {
    com.google.cloud.bigtable.hbase.BatchExecutor.LOG.trace("exists(List<>)");
    org.apache.hadoop.hbase.client.Result[] getResults = ((org.apache.hadoop.hbase.client.Result[]) (batch(gets)));
    java.lang.Boolean[] exists = new java.lang.Boolean[getResults.length];
    for (int index = 0; index < (getResults.length); index++) {
        exists[index] = !(getResults[index].isEmpty());
    }
    return exists;
}