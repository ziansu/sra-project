@java.lang.Override
public void callback(java.lang.Object object) {
    try {
        final int responseCode = ((org.json.JSONObject) (object)).getInt("responseCode");
        final java.lang.String response = ((org.json.JSONObject) (object)).getString("response");
        org.json.JSONArray jsonArray = new org.json.JSONArray(response);
        updateSurroundingHoles(jsonArray);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}