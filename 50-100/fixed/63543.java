public static org.json.JSONObject readJsonFromUrl(java.lang.String url) throws java.io.IOException, org.json.JSONException {
    try (java.io.InputStream is = new java.net.URL(url).openStream()) {
        java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(is, java.nio.charset.Charset.forName("UTF-8")));
        java.lang.String jsonText = com.discordbot.util.Util.readAll(rd);
        return new org.json.JSONObject(jsonText);
    }
}