protected static org.json.JSONObject createJSON6(java.lang.String name) {
    org.json.JSONObject json = new org.json.JSONObject();
    int key = 6;
    try {
        json.put("key", key);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    try {
        json.put("studentName", name);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return json;
}