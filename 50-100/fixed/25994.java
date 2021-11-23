private static java.util.Map<java.lang.String, java.lang.Object> readConfig(java.lang.String path) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.io.File config = new java.io.File(path);
    try {
        map = mapper.readValue(config, new com.fasterxml.jackson.core.type.TypeReference<java.util.HashMap<java.lang.String, java.lang.Object>>() {        });
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return map;
}