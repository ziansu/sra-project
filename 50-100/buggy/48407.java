public T deserialize(java.lang.String topic, byte[] data) {
    try {
        org.springframework.kafka.support.serializer.JsonDeserializer.LOGGER.debug("Start processing");
        T result = null;
        if (data != null) {
            result = reader.readValue(data);
        }
        org.springframework.kafka.support.serializer.JsonDeserializer.LOGGER.debug("Finish processing");
        return result;
    } catch (com.fasterxml.jackson.core.JsonParseException ex) {
        org.springframework.kafka.support.serializer.JsonDeserializer.LOGGER.error("Failed processing", ex);
        return null;
    } catch (java.io.IOException ex) {
        org.springframework.kafka.support.serializer.JsonDeserializer.LOGGER.debug("Failed processing");
        throw new org.springframework.kafka.support.serializer.JsonWrapperException(ex);
    }
}