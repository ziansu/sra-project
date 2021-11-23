public void shutdown() throws java.lang.InterruptedException {
    com.alibaba.rocketmq.client.consumer.cacheable.CacheableConsumer.LOGGER.info("Start to shutdown");
    status = com.alibaba.rocketmq.client.ClientStatus.CLOSED;
    try {
        stopReceiving();
    } catch (java.lang.InterruptedException e) {
        com.alibaba.rocketmq.client.consumer.cacheable.CacheableConsumer.LOGGER.error("Failed to stop", e);
    }
    try {
        if (null != (localMessageStore)) {
            localMessageStore.close();
        }
    } catch (java.lang.InterruptedException e) {
        com.alibaba.rocketmq.client.consumer.cacheable.CacheableConsumer.LOGGER.error("Failed to stop", e);
    }
    com.alibaba.rocketmq.client.consumer.cacheable.CacheableConsumer.LOGGER.info("Shutdown completes");
}