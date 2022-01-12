public static void main(java.lang.String[] args) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.hazelcast.config.Config config = new com.hazelcast.config.Config();
    com.hazelcast.config.DurableExecutorConfig durableExecutorConfig = config.getDurableExecutorConfig("exec");
    durableExecutorConfig.setCapacity(200);
    durableExecutorConfig.setDurability(2);
    durableExecutorConfig.setPoolSize(8);
    com.hazelcast.core.HazelcastInstance instance = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
    com.hazelcast.durableexecutor.DurableExecutorService executorService = instance.getDurableExecutorService("exec");
    com.hazelcast.durableexecutor.DurableExecutorServiceFuture<?> durableExecutor = executorService.submit(new configuration.EchoTask("DurableExecutor"));
    durableExecutor.get();
}