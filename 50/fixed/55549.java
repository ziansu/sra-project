public static boolean isJSON(java.lang.String str) {
    try {
        new org.json.JSONObject(str);
        return true;
    } catch (org.json.JSONException e) {
        return false;
    }
}