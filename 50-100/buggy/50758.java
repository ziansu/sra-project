public long get_quota() {
    org.json.JSONObject json = new org.json.JSONObject();
    try {
        json.put("a", "uq");
        json.put("xfer", 1);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return new org.json.JSONObject(api_request(json.toString())).getLong("mstrg");
}