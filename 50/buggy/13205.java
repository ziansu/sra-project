public static com.fasterxml.jackson.databind.ObjectMapper getMapper() {
    com.fasterxml.jackson.databind.ObjectMapper mapper = org.votingsystem.util.JSON.getMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.enable(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN);
    mapper.getJsonFactory().setCharacterEscapes(new org.votingsystem.util.JSON.HTMLCharacterEscapes());
    return mapper;
}