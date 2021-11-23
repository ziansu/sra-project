public java.lang.Object serialize() throws com.fasterxml.jackson.core.JsonProcessingException {
    return writer.writeValueAsString(results);
}