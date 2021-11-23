public org.json.JSONObject getJsonIdOfPerson() {
    org.json.JSONObject returnJson = new org.json.JSONObject();
    try {
        returnJson.put("id", getId());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return returnJson;
}