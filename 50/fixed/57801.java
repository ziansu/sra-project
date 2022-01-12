private java.lang.String getPrettyJson(java.lang.String json, java.lang.String jsonPath) {
    try {
        return getPrettyJson(com.jayway.jsonpath.JsonPath.read(json, jsonPath));
    } catch (java.lang.Exception e) {
        return "No match";
    }
}