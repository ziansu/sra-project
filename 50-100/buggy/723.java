@java.lang.Override
org.json.JSONObject send(java.lang.String link, com.google.common.base.Optional<java.util.Map<java.lang.String, java.lang.Object>> data) throws java.io.IOException, java.net.URISyntaxException {
    java.net.URL url = new java.net.URL(link);
    org.apache.http.client.HttpClient client = new org.apache.http.impl.client.DefaultHttpClient();
    org.apache.http.client.methods.HttpGet request = new org.apache.http.client.methods.HttpGet();
    request.setURI(new java.net.URI(link));
    org.apache.http.HttpResponse response = client.execute(request);
    org.json.JSONObject res = null;
    try {
        res = getString(response);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return res;
}