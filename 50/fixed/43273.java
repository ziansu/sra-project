public static java.lang.String createJsonFromString(java.lang.String keyName, java.lang.String value) {
    java.lang.String json = java.lang.String.format("{\"%s\": \"%s\"}", keyName, value);
    return json;
}