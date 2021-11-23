public static java.util.Map<java.lang.String, java.lang.Object> addDeserializerToConfig(java.util.Map<java.lang.String, java.lang.Object> configs, org.apache.kafka.common.serialization.Deserializer<?> keyDeserializer, org.apache.kafka.common.serialization.Deserializer<?> valueDeserializer) {
    java.util.Map<java.lang.String, java.lang.Object> newConfigs = new java.util.HashMap<java.lang.String, java.lang.Object>();
    newConfigs.putAll(configs);
    if (keyDeserializer != null)
        newConfigs.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, keyDeserializer.getClass());
    
    if (valueDeserializer != null)
        newConfigs.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, valueDeserializer.getClass());
    
    return newConfigs;
}