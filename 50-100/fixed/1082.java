public void receive(com.ycf.ConsumerCallback callback, java.lang.String groupId, java.util.List<java.lang.String> topicList, java.lang.Long cycle) {
    this.config.setProperty("group.id", groupId);
    org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.Object> consumer = new org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.String, java.lang.Object>(this.config);
    consumer.subscribe(topicList);
    com.ycf.ConsumerThread thread = new com.ycf.ConsumerThread(consumer, callback, cycle);
    thread.start();
}