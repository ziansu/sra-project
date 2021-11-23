public static java.lang.String readStringFromURL(java.lang.String url) throws java.io.IOException {
    org.json.JSONObject json = My.JsonReader.readJsonFromUrl(url);
    return json.toString();
}