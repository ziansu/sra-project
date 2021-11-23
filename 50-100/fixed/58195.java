public boolean checkForQueueProducer(java.lang.String queueName, java.lang.String producerName) {
    java.lang.String[] producers = getQueueProducers(queueName);
    for (int x = 0; x < (producers.length); x++) {
        if (producers[x].equals(producerName))
            return true;
        
    }
    return false;
}