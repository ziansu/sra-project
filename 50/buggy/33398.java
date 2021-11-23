public boolean isJSONArrayValid(java.lang.String test) {
    try {
        new org.json.JSONArray(test);
    } catch (org.json.JSONException ex) {
        return false;
    }
    return true;
}