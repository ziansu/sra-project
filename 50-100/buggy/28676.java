public void run() {
    org.apache.cassandra.config.CFMetaData.SpeculativeRetry retryPolicy = this.metadata.getSpeculativeRetry();
    switch (retryPolicy.type) {
        case PERCENTILE :
            sampleLatencyNanos = ((long) ((metric.coordinatorReadLatency.getSnapshot().getValue(retryPolicy.value)) * 1000.0));
            break;
        case CUSTOM :
            sampleLatencyNanos = ((long) (((retryPolicy.value) * 1000.0) * 1000.0));
            break;
        default :
            sampleLatencyNanos = java.lang.Long.MAX_VALUE;
            break;
    }
}