public void shutdown() {
    com.hazelcast.client.spi.impl.ClientExecutionServiceImpl.shutdownExecutor("registrationExecutor", registrationExecutor, logger);
}