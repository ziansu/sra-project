protected void update(org.json.JSONObject data) {
    try {
        content = data.getString("content");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}