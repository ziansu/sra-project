public static java.util.Map<?, ?> readJson(java.lang.String json) {
    return ((java.util.Map<?, ?>) (com.cedarsoftware.util.io.JsonReader.jsonToJava(json, java.util.Collections.singletonMap(JsonReader.USE_MAPS, true))));
}