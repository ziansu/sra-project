private org.json.JSONObject getOrientationJSON() {
    org.json.JSONObject r = new org.json.JSONObject();
    try {
        r.put("x", this.x);
        r.put("y", this.y);
        r.put("z", this.z);
        r.put("timestamp", this.timestamp);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return r;
}