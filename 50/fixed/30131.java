public static java.lang.String getStringFrom(java.lang.Object o) throws java.lang.Exception {
    if (o == null)
        return null;
    
    com.fasterxml.jackson.databind.JsonNode js = ((com.fasterxml.jackson.databind.JsonNode) (o));
    return js.asText();
}