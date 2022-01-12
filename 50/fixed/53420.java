private void parseJson(java.lang.String jsonString) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(jsonString);
        pinDetails.add(jsonObject.getString("image"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    setupPinDetails();
}