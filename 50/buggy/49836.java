private kafka.serializer.Decoder<?> getPayloadDecoder() throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.String payloadDecoder = properties.getPayloadDecoder();
    return getDecoder(payloadDecoder);
}