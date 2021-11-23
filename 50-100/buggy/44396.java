public static void post(java.lang.String url, java.lang.String username, java.lang.String password, org.json.JSONObject json, com.loopj.android.http.AsyncHttpResponseHandler responseHandler) throws java.io.UnsupportedEncodingException {
    com.github.albalitz.save.persistence.api.Request.client.setBasicAuth(username, password);
    com.github.albalitz.save.persistence.api.Request.client.post(com.github.albalitz.save.SaveApplication.getAppContext(), url, new cz.msebera.android.httpclient.entity.StringEntity(json.toString()), "application/json", responseHandler);
}