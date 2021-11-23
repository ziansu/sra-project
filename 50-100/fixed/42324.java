@org.junit.Test
@java.lang.Override
public void testUpdate() throws java.lang.Exception {
    java.lang.String title = "incident test title changed";
    org.json.JSONObject incident = new org.json.JSONObject();
    incident.put("title", title);
    java.lang.String incidentJson = requestUtil.makeRequest(util.RequestUtil.genRelUrl((((getAllURL()) + "/") + (savedId))), incident, "PUT");
    org.json.JSONObject incidentJSONObject = new org.json.JSONObject(incidentJson);
    assertEquals(incidentJSONObject.getString("title"), title);
}