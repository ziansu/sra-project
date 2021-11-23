private static void post(java.lang.String url, org.json.JSONObject jsonBody, name.l33t.radiopi.AsyncHttpResponseHandler responseHandler) {
    org.apache.http.entity.StringEntity entity = null;
    try {
        entity = new org.apache.http.entity.StringEntity(jsonBody.toString());
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    name.l33t.radiopi.RemotePlayer.client.post(name.l33t.radiopi.RemotePlayer.static_context, name.l33t.radiopi.RemotePlayer.getAbsoluteUrl(url), entity, "application/json", responseHandler);
}