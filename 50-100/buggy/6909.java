public boolean regConsumer(com.seveniu.consumer.Consumer consumer) {
    if (this.consumerMap.containsKey(consumer.getName())) {
        logger.warn("consumer '{}' has reg", consumer.getName());
        return false;
    }else {
        this.consumerMap.put(consumer.getUuid(), consumer);
        logger.info("reg consumer : {}", consumer);
        consumer.start();
        return true;
    }
}