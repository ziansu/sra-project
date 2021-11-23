public T stringToObject(java.lang.String json, java.lang.Class clazz) {
    com.fasterxml.jackson.databind.ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        T result = ((T) (objectMapper.readValue(json, clazz)));
        return result;
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(this.getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return null;
}