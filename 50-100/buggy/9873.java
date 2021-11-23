@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Primary
public com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper() {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper().setPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
    com.fasterxml.jackson.databind.module.SimpleModule jsonObjectModule = new com.fasterxml.jackson.databind.module.SimpleModule();
    jsonObjectModule.addSerializer(org.json.JSONObject.class, new com.fasterxml.jackson.datatype.jsonorg.JSONObjectSerializer());
    jsonObjectModule.addDeserializer(org.json.JSONObject.class, new com.fasterxml.jackson.datatype.jsonorg.JSONObjectDeserializer());
    objectMapper.registerModule(jsonObjectModule);
    objectMapper.registerModule(enumModule());
    objectMapper.registerModule(new com.fasterxml.jackson.datatype.jdk8.Jdk8Module());
    objectMapper.registerModule(new org.zalando.problem.ProblemModule());
    return objectMapper;
}