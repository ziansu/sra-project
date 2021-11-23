@java.lang.Override
public void onResponse(int status, java.lang.String apiContent) {
    if (status == (demo.kolorob.kolorobdemoversion.utils.AppConstants.SUCCESS_CODE)) {
        try {
            org.json.JSONArray allData = new org.json.JSONArray(apiContent);
            HealthDatSize = allData.length();
            for (int i = 0; i <= (HealthDatSize); i++) {
                org.json.JSONObject jsonObject = allData.getJSONObject(i);
                SaveHealthtData(jsonObject);
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}