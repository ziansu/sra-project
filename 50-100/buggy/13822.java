public static java.lang.String toJson(java.lang.Object obj) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String string;
    try {
        string = mapper.writeValueAsString(obj);
    } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    return string;
}