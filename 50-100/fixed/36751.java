private static java.lang.String prettyPrintJson(final java.lang.String jsonString) {
    if (org.apache.commons.lang3.StringUtils.isBlank(jsonString)) {
        return "No result returned";
    }
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().setPrettyPrinting().create();
    com.google.gson.JsonParser jp = new com.google.gson.JsonParser();
    com.google.gson.JsonElement je = jp.parse(jsonString.trim());
    return gson.toJson(je);
}