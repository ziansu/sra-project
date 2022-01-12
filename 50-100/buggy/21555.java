public static java.lang.Object jsonToDataArray(java.lang.String json, java.lang.String obj) throws java.lang.ClassNotFoundException {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        return mapper.readValue(json, java.lang.Class.forName(obj));
    } catch (com.fasterxml.jackson.core.JsonParseException e) {
        e.printStackTrace();
    } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}