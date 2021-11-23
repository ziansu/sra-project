public org.json.simple.JSONObject createJsonObject() {
    org.json.simple.JSONObject jsonRule = new org.json.simple.JSONObject();
    org.json.simple.JSONArray fields = new org.json.simple.JSONArray();
    fields.add("entityId");
    jsonRule.put("fields", fields);
    jsonRule.put("regex", "room1");
    jsonRule.put("fiware_service_path", "/rooms");
    jsonRule.put("destination", "all_rooms");
    return jsonRule;
}