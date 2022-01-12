public static java.util.Map<?, ?> readJson(java.lang.CharSequence json) {
    return ((java.util.Map<?, ?>) (com.cedarsoftware.util.io.JsonReader.jsonToJava(json.toString(), java.util.Collections.singletonMap(JsonReader.USE_MAPS, true))));
}