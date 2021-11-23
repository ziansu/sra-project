private void loopEvents(java.util.List<org.json.JSONObject> events, org.json.JSONObject clientClassificationJson) throws java.lang.Exception {
    for (org.json.JSONObject event : events) {
        java.lang.String baseEntityId = event.getString(org.ei.opensrp.sync.ClientProcessor.baseEntityIdJSONKey);
        org.json.JSONObject client = mCloudantDataHandler.getClientByBaseEntityId(baseEntityId);
        org.json.JSONObject eventJsonObject = event;
        org.json.JSONArray clientClasses = clientClassificationJson.getJSONArray("case_classification_rules");
        loopClientClasses(clientClasses, eventJsonObject, event, client);
    }
}