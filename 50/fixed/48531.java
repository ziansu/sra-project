private com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet createTasklet() {
    final com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet t = new com.hazelcast.jet.impl.execution.CooperativeProcessorTasklet(context, processor, instreams, outstreams, null, null);
    t.init(new java.util.concurrent.CompletableFuture<>());
    return t;
}