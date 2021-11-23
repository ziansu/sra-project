public void stop() throws java.lang.RuntimeException {
    if ((kafkaConsumerConnector) != null)
        kafkaConsumerConnector.shutdown();
    
    if ((kafkaConsumingThreadPool) != null)
        kafkaConsumingThreadPool.shutdown();
    
    while (!(kafkaConsumingThreadPool.isTerminated())) {
    } 
}