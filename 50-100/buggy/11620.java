public org.json.JSONObject toJSON() {
    org.json.JSONObject json = new org.json.JSONObject();
    org.json.JSONArray a = new org.json.JSONArray();
    for (com.whizzosoftware.hobson.dto.ErrorDTO error : errors) {
        a.put(error);
    }
    json.put("errors", a);
    return json;
}