public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.hazelcast.config.Config config = new com.hazelcast.config.Config();
    config.getDurableExecutorConfig("exec").setCapacity(200).setDurability(2).setPoolSize(8);
    com.hazelcast.core.HazelcastInstance instance = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
    com.hazelcast.durableexecutor.DurableExecutorService executorService = instance.getDurableExecutorService("exec");
    com.hazelcast.durableexecutor.DurableExecutorServiceFuture<?> durableExecutor = executorService.submit(new configuration.EchoTask("DurableExecutor"));
    durableExecutor.get();
}