private boolean hideMessageByJSONSetting(org.json.JSONArray array) {
    org.json.JSONObject object = array[0];
    try {
        if ((object.getJSONObject("data").getBoolean("notification")) == false) {
            return false;
        }
    } catch (java.lang.Exception e) {
        return true;
    }
    return true;
}