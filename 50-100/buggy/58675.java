@java.lang.Override
protected org.springframework.cloud.stream.binder.Binding<org.apache.kafka.streams.kstream.KStream<java.lang.Object, java.lang.Object>> doBindConsumer(java.lang.String name, java.lang.String group, org.apache.kafka.streams.kstream.KStream<java.lang.Object, java.lang.Object> inputTarget, org.springframework.cloud.stream.binder.ExtendedConsumerProperties<org.springframework.cloud.stream.binder.kstream.config.KStreamConsumerProperties> properties) {
    org.springframework.cloud.stream.binder.ExtendedConsumerProperties<org.springframework.cloud.stream.binder.kafka.properties.KafkaConsumerProperties> extendedConsumerProperties = new org.springframework.cloud.stream.binder.ExtendedConsumerProperties(new org.springframework.cloud.stream.binder.kstream.config.KStreamConsumerProperties());
    org.springframework.beans.BeanUtils.copyProperties(properties, extendedConsumerProperties, "extension");
    this.kafkaTopicProvisioner.provisionConsumerDestination(name, group, extendedConsumerProperties);
    return new org.springframework.cloud.stream.binder.DefaultBinding(name, group, inputTarget, null);
}