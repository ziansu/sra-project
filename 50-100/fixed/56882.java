public byte[] serialize(java.lang.String topic, T data) {
    try {
        org.springframework.kafka.support.serializer.JsonSerializer.LOGGER.debug("Start processing");
        byte[] result = null;
        if (data != null) {
            result = this.writer.writeValueAsBytes(data);
        }
        org.springframework.kafka.support.serializer.JsonSerializer.LOGGER.debug("Finish processing");
        return result;
    } catch (com.fasterxml.jackson.core.JsonProcessingException ex) {
        org.springframework.kafka.support.serializer.JsonSerializer.LOGGER.debug("Failed processing");
        throw new org.springframework.kafka.support.serializer.JsonWrapperException(ex);
    }
}