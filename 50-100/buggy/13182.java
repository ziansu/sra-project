@java.lang.Override
public void OnPostExecute(java.lang.String result) {
    try {
        org.json.JSONObject obj = new org.json.JSONObject(result);
        java.lang.String name = obj.getJSONObject("response").getJSONArray("docs").getJSONObject(0).getString("name");
        locationText.setText(name);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}