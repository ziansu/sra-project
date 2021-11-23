public static java.lang.String subscribe(org.json.JSONObject json_filter, int handler_callback) throws org.json.JSONException {
    org.json.JSONObject root = new org.json.JSONObject();
    root.put("name", "subscribe");
    root.put("query", json_filter.toString());
    root.put("id", handler_callback);
    return root.toString();
}