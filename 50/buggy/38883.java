private com.hazelcast.jet.impl.execution.BlockingProcessorTasklet createTasklet() {
    final com.hazelcast.jet.impl.execution.BlockingProcessorTasklet t = new com.hazelcast.jet.impl.execution.BlockingProcessorTasklet("mock", context, processor, instreams, outstreams);
    t.init(jobFuture);
    return t;
}