private static org.json.JSONObject readJsonFromUrl(java.lang.String url) throws java.io.IOException {
    org.json.JSONObject json;
    java.io.InputStream is = new java.net.URL(url).openStream();
    java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(is, java.nio.charset.Charset.forName("UTF-8")));
    json = new org.json.JSONObject(org.lajuderia.communication.IGDBAPI.readAll(rd));
    is.close();
    return json;
}