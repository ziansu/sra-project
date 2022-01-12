@org.springframework.context.annotation.Bean(name = { "asyncUpdateExecutor" }, destroyMethod = "shutdown")
public org.elasticsoftware.elasticactors.util.concurrent.ThreadBoundExecutor createAsyncUpdateExecutor() {
    final int workers = env.getProperty("ea.asyncUpdateExecutor.workerCount", java.lang.Integer.class, ((java.lang.Runtime.getRuntime().availableProcessors()) * 3));
    final int batchSize = env.getProperty("ea.asyncUpdateExecutor.batchSize", java.lang.Integer.class, 20);
    return new org.elasticsoftware.elasticactors.util.concurrent.ThreadBoundExecutorImpl(new org.elasticsoftware.elasticactors.cassandra2.state.PersistentActorUpdateEventProcessor(cassandraSession), batchSize, new org.elasticsoftware.elasticactors.util.concurrent.DaemonThreadFactory("UPDATE-EXECUTOR-WORKER"), workers);
}