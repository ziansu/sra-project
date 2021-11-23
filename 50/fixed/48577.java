@com.google.common.annotations.VisibleForTesting
org.apache.beam.sdk.io.cassandra.CassandraService<T> getCassandraService(org.apache.beam.sdk.options.PipelineOptions pipelineOptions) {
    if ((cassandraService()) != null) {
        return cassandraService();
    }
    return new org.apache.beam.sdk.io.cassandra.CassandraServiceImpl();
}