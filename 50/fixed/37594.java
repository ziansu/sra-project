public org.json.JSONArray getAsJSONArray(java.lang.String key) {
    java.lang.String JSONString = getAsString(key);
    try {
        return new org.json.JSONArray(JSONString);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}