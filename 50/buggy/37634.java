private boolean isJson(java.lang.String jsonString) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(jsonString);
        return true;
    } catch (org.json.JSONException je) {
        android.util.Log.e("CoverosMobileApp", "isJson is false", je);
        return false;
    }
}