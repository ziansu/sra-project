@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, byte[] response) {
    try {
        org.json.JSONObject obj = new org.json.JSONObject(new java.lang.String(response, "UTF-8"));
        my_pin = obj.getInt("pin");
        countDown = obj.getInt("countDown");
        startSharingLocation();
    } catch (java.io.UnsupportedEncodingException e) {
    } catch (org.json.JSONException e) {
    }
}