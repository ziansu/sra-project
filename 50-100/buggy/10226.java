public void setNewMetric(java.lang.String newPath, java.lang.String metricName) {
    this.path = newPath;
    this.metricName = metricName;
    topJsonObject = new org.json.JSONObject();
    topJsonArray = new org.json.JSONArray();
    try {
        topJsonObject.put("target", metricName);
        dataArray = new org.json.JSONArray();
        topJsonObject.put("datapoints", dataArray);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    topJsonArray.put(topJsonObject);
}