public static void removeAndClose(java.lang.String nameServerAddress, java.lang.String group) {
    if (group == null) {
        group = org.apache.rocketmq.logappender.common.ProducerInstance.DEFAULT_GROUP;
    }
    java.lang.String genKey = org.apache.rocketmq.logappender.common.ProducerInstance.genKey(nameServerAddress, group);
    org.apache.rocketmq.client.producer.MQProducer producer = org.apache.rocketmq.logappender.common.ProducerInstance.producerMap.get(genKey);
    org.apache.rocketmq.logappender.common.ProducerInstance.producerMap.remove(genKey);
    if (producer != null) {
        producer.shutdown();
    }
}