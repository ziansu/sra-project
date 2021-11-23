public static java.lang.String asJsonString(final java.lang.Object obj) throws java.lang.Exception {
    final com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    return mapper.writeValueAsString(obj);
}