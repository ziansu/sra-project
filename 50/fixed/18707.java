public org.json.JSONObject getJSON() throws java.io.IOException {
    ignoreContentType();
    java.lang.String jsonString = response().body();
    return new org.json.JSONObject(jsonString);
}