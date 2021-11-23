public static com.google.gson.JsonArray convertEntityToJson(org.apache.http.HttpEntity entity) {
    com.google.gson.JsonArray resultElement = new com.google.gson.JsonArray();
    try {
        java.lang.String results = org.apache.http.util.EntityUtils.toString(entity);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        resultElement = gson.toJsonTree(results).getAsJsonArray();
        com.google.gson.JsonParser parser = new com.google.gson.JsonParser();
        com.google.gson.JsonElement jsonElement = parser.parse(results);
        com.google.gson.JsonArray jsonArray = jsonElement.getAsJsonArray();
        java.lang.System.out.println(jsonArray);
    } catch (java.io.IOException e) {
    }
    return resultElement;
}