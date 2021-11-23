protected static java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> convertValuesToJsonNodes(java.util.Map<java.lang.String, java.lang.String> queryParameters) {
    java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> parameters = new java.util.HashMap<>();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : queryParameters.entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.String value = entry.getValue();
        parameters.put(key, org.n52.io.request.IoParameters.getJsonNodeFrom(value));
    }
    return parameters;
}