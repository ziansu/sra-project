public static java.lang.String convertObjectToJsonStringUsingView(java.lang.Object object, java.lang.Class jsonView, com.fasterxml.jackson.databind.ObjectMapper mapper) throws java.io.IOException {
    if (mapper == null) {
        mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    }
    if (jsonView != null)
        return mapper.writerWithView(jsonView).writeValueAsString(object);
    
    return mapper.writeValueAsString(object);
}