public java.lang.Object[] batch(java.util.List<? extends org.apache.hadoop.hbase.client.Row> actions) throws java.io.IOException {
    com.google.cloud.bigtable.hbase.BatchExecutor.LOG.trace("batch(List<>)");
    org.apache.hadoop.hbase.client.Result[] results = new org.apache.hadoop.hbase.client.Result[actions.size()];
    try {
        batch(actions, results);
    } catch (java.lang.InterruptedException e) {
        com.google.cloud.bigtable.hbase.BatchExecutor.LOG.error("Encountered exception in batch(List<>).", e);
        throw new java.io.IOException("Batch error", e);
    }
    return results;
}