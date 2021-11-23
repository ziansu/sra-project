private static org.json.JSONObject readJsonFromUrl(java.lang.String url) throws java.io.IOException {
    java.io.InputStream is = new java.net.URL(url).openStream();
    try {
        java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(is, java.nio.charset.Charset.forName("UTF-8")));
        org.json.JSONObject json = new org.json.JSONObject(org.lajuderia.communication.IGDBAPI.readAll(rd));
        return json;
    } finally {
        is.close();
    }
}