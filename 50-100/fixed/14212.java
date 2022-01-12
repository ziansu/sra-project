public void flushCommits() throws java.io.IOException {
    org.apache.hadoop.hbase.client.BufferedMutator bufMutator = connection.getBufferedMutator(this.tableName);
    for (java.util.concurrent.ConcurrentLinkedQueue<org.apache.hadoop.hbase.client.Mutation> buffer : bPool) {
        for (org.apache.hadoop.hbase.client.Mutation m : buffer) {
            bufMutator.mutate(m);
            bufMutator.flush();
        }
    }
    bufMutator.close();
}