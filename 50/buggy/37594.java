public org.json.JSONArray getAsJSONArray(java.lang.String key) {
    java.lang.String JSONString = getAsString(key);
    try {
        org.json.JSONArray obj = new org.json.JSONArray(JSONString);
        return obj;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}