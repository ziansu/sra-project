@java.lang.Override
public void onResponse(int status, java.lang.String apiContent) {
    try {
        org.json.JSONArray allData = new org.json.JSONArray(apiContent);
        EntDataSize = allData.length();
        for (int i = 0; i <= (EntDataSize); i++) {
            org.json.JSONObject jsonObject = allData.getJSONObject(i);
            SaveEntertainmentData(jsonObject, i);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}