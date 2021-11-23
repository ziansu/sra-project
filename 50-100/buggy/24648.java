public static java.lang.String convertObjectToJsonStringUsingView(java.lang.Object object, java.lang.Class jsonView, com.fasterxml.jackson.databind.ObjectMapper mapper) throws java.io.IOException {
    if (mapper == null) {
        mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    }
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    if (jsonView != null)
        return mapper.writeValueAsString(object);
    
    return mapper.writerWithView(jsonView).writeValueAsString(object);
}