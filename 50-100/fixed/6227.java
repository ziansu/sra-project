private boolean isJsonArray(java.lang.String jsonString) {
    try {
        org.json.JSONArray responseArray = new org.json.JSONArray(jsonString);
        org.json.JSONObject wrapper = new org.json.JSONObject();
        wrapper.put(com.coveros.coverosmobileapp.oauth.RestRequest.ORIGINAL_RESPONSE_TAG, responseArray);
        return true;
    } catch (org.json.JSONException je) {
        return false;
    }
}