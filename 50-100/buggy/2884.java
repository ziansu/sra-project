public net.minidev.json.JSONObject getJSONObject() {
    net.minidev.json.JSONObject obj = new net.minidev.json.JSONObject();
    try {
        obj.put("uniqueID", this.uniqueID);
        obj.put("creatorId", this.creatorId);
        obj.put("time", "0");
        obj.put("message", this.message);
    } catch (java.lang.Exception e) {
    }
    return obj;
}