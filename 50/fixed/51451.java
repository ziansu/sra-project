@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Primary
public com.fasterxml.jackson.databind.ObjectMapper objectMapper() {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    mapper.findAndRegisterModules();
    return mapper;
}