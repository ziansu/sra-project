public void updateState(java.util.List<storm.trident.tuple.TridentTuple> tuples, storm.trident.operation.TridentCollector tridentCollector) {
    try {
        this.options.execute(tuples);
    } catch (java.io.IOException e) {
        org.apache.storm.hdfs.trident.HdfsState.LOG.warn("Failing batch due to IOException.", e);
        throw new backtype.storm.topology.FailedException(e);
    }
}