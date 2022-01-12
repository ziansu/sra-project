private int _delayForGrade(org.json.JSONObject conf, int left) {
    try {
        int delay;
        org.json.JSONArray ja = conf.getJSONArray("delays");
        int len = ja.length();
        try {
            delay = conf.getJSONArray("delays").getInt((len - left));
        } catch (org.json.JSONException e) {
            delay = conf.getJSONArray("delays").getInt(0);
        }
        return delay * 60;
    } catch (org.json.JSONException e) {
        throw new java.lang.RuntimeException(e);
    }
}