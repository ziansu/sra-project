private void loopClientClasses(org.json.JSONArray clientClasses, org.json.JSONObject eventJsonObject, org.json.JSONObject event, org.json.JSONObject client) throws java.lang.Exception {
    for (int i = 0; i < (clientClasses.length()); i++) {
        org.json.JSONObject object = clientClasses.getJSONObject(i);
        org.json.JSONObject ruleObject = object.getJSONObject("rule");
        org.json.JSONArray fields = ruleObject.getJSONArray("fields");
        loopFields(fields, eventJsonObject, event, client);
    }
}