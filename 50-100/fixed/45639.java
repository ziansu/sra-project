static com.fasterxml.jackson.databind.ObjectMapper createModifiableObjectMapper(final com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
    objectMapper.registerModule(new com.arpnetworking.commons.jackson.databind.module.BuilderModule());
    com.arpnetworking.commons.jackson.databind.ObjectMapperFactory.registerModule(objectMapper, "com.fasterxml.jackson.datatype.guava.GuavaModule");
    com.arpnetworking.commons.jackson.databind.ObjectMapperFactory.registerModule(objectMapper, "com.fasterxml.jackson.datatype.jdk8.Jdk8Module");
    com.arpnetworking.commons.jackson.databind.ObjectMapperFactory.registerModule(objectMapper, "com.fasterxml.jackson.datatype.joda.JodaModule");
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    objectMapper.setDateFormat(new com.fasterxml.jackson.databind.util.ISO8601DateFormat());
    return objectMapper;
}