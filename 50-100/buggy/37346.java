protected org.json.JSONObject setMetaData(org.json.JSONObject patient, org.json.JSONObject content) {
    if (patient.has("meta")) {
        if (patient.getJSONObject("meta").has("lastUpdated"))
            content.put("dateChanged", patient.getJSONObject("meta").optString("lastUpdated"));
        
    }
    return content;
}