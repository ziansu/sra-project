@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Primary
public com.fasterxml.jackson.databind.ObjectMapper getObjectMapper() {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    return objectMapper;
}