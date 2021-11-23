private boolean isJsonBoolean(java.lang.String jsonString) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject();
        if (jsonString.equals(java.lang.Boolean.TRUE.toString())) {
            jsonObject.put(com.coveros.coverosmobileapp.oauth.RestRequest.ORIGINAL_RESPONSE_TAG, true);
        }
        if (jsonString.equals(java.lang.Boolean.FALSE.toString())) {
            jsonObject.put(com.coveros.coverosmobileapp.oauth.RestRequest.ORIGINAL_RESPONSE_TAG, false);
        }
        return true;
    } catch (org.json.JSONException je) {
        android.util.Log.e("CoverosMobileApp", "isJsonBoolean is false", je);
        return false;
    }
}