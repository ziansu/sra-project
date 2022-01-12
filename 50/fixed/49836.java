private kafka.serializer.Decoder<?> getPayloadDecoder() throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.Class payloadDecoder = properties.getPayloadDecoder();
    return getDecoder(payloadDecoder);
}