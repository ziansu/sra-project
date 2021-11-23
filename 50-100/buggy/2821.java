public static java.lang.String getCityIDByResponseText(java.lang.String responseText) {
    if (responseText != null) {
        android.os.Looper.prepare();
        try {
            java.lang.String cityID = "";
            org.json.JSONObject obj = new org.json.JSONObject(responseText);
            org.json.JSONArray arr1 = obj.getJSONArray("HeWeather5");
            org.json.JSONObject obj2 = arr1.getJSONObject(0);
            org.json.JSONObject obj3 = obj2.getJSONObject("basic");
            cityID = obj3.getString("id");
            return cityID;
        } catch (org.json.JSONException e) {
        }
        android.os.Looper.loop();
    }
    return null;
}