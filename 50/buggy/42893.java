public void shutdown() {
    eventExecutor.shutdown();
    com.hazelcast.client.spi.impl.ClientExecutionServiceImpl.shutdownExecutor("registrationExecutor", registrationExecutor, logger);
}