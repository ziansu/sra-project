public static java.util.Properties addDeserializerToConfig(java.util.Properties properties, org.apache.kafka.common.serialization.Deserializer<?> keyDeserializer, org.apache.kafka.common.serialization.Deserializer<?> valueDeserializer) {
    java.util.Properties newProperties = new java.util.Properties();
    newProperties.putAll(properties);
    if (keyDeserializer != null)
        newProperties.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, keyDeserializer.getClass().getName());
    
    if (keyDeserializer != null)
        newProperties.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, valueDeserializer.getClass().getName());
    
    return newProperties;
}