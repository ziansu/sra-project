@entity.Transient
public java.util.Map getArgMap() {
    com.fasterxml.jackson.core.JsonFactory factory = new com.fasterxml.jackson.core.JsonFactory();
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper(factory);
    com.fasterxml.jackson.core.type.TypeReference<java.util.HashMap<java.lang.String, java.lang.Object>> typeRef = new com.fasterxml.jackson.core.type.TypeReference<java.util.HashMap<java.lang.String, java.lang.Object>>() {    };
    try {
        return mapper.readValue(getArg(), typeRef);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}