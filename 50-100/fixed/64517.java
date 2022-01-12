public boolean isDataParsed(java.lang.String json_data) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        if ((json_data != null) & (!(json_data.isEmpty()))) {
            JSONParsedData = mapper.readTree(json_data);
            return true;
        }else {
            return false;
        }
    } catch (com.fasterxml.jackson.core.JsonParseException | com.fasterxml.jackson.core.JsonGenerationException | com.fasterxml.jackson.databind.JsonMappingException e) {
        return false;
    } catch (java.io.IOException e) {
        return false;
    }
}