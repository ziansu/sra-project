public org.json.JSONObject getJsonObj() {
    try {
        jsonObj = new org.json.JSONObject(jsonPath.prettyPrint());
    } catch (org.json.JSONException e) {
        jsonObj = new org.json.JSONObject();
        jsonObj.put("", new org.json.JSONArray(jsonPath.prettyPrint()));
    }
    return jsonObj;
}