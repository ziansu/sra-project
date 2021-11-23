public boolean isDataParsed(java.lang.String json_data) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        JSONParsedData = mapper.readTree(json_data);
        return true;
    } catch (com.fasterxml.jackson.core.JsonParseException | com.fasterxml.jackson.core.JsonGenerationException | com.fasterxml.jackson.databind.JsonMappingException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return false;
}