public void setProDevEvents(org.json.JSONObject json) {
    try {
        proDevEvents = json.getInt("pro_dev_events");
    } catch (org.json.JSONException e) {
    }
}