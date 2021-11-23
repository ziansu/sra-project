public org.json.JSONObject getJsonObj() {
    try {
        jsonObj = new org.json.JSONObject(prettyPrint(jsonPath));
    } catch (org.json.JSONException e) {
        jsonObj = new org.json.JSONObject();
        jsonObj.put("", new org.json.JSONArray(prettyPrint(jsonPath)));
    }
    return jsonObj;
}