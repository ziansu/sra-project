public java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> parse(java.lang.String jsonData) {
    org.json.JSONArray jsonArray = null;
    org.json.JSONObject jsonObject;
    try {
        android.util.Log.d("Places", "parse");
        jsonObject = new org.json.JSONObject(((java.lang.String) (jsonData)));
        jsonArray = jsonObject.getJSONArray("results");
    } catch (org.json.JSONException e) {
        android.util.Log.d("Places", "parse error");
        e.printStackTrace();
    }
    return getPlaces(jsonArray);
}