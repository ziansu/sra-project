private boolean hideMessageByJSONSetting(org.json.JSONArray array) {
    try {
        org.json.JSONObject object = array.get(0);
        if ((object.getJSONObject("data").getBoolean("notification")) == false) {
            return false;
        }
    } catch (java.lang.Exception e) {
        return true;
    }
    return true;
}