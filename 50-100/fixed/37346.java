protected org.json.JSONObject setMetaData(org.json.JSONObject patient, org.json.JSONObject content) {
    org.json.JSONObject temp = content;
    if (patient.has("meta")) {
        if (patient.getJSONObject("meta").has("lastUpdated"))
            temp.put("dateChanged", patient.getJSONObject("meta").optString("lastUpdated"));
        
    }
    return temp;
}