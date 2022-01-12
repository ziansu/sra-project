private int _delayForGrade(org.json.JSONObject conf, int left) {
    try {
        int delay;
        org.json.JSONArray ja = conf.getJSONArray("delays");
        int len = ja.length();
        if (len < left) {
            delay = ja.getInt(0);
        }else {
            delay = conf.getJSONArray("delays").getInt((len - left));
        }
        return delay * 60;
    } catch (org.json.JSONException e) {
        throw new java.lang.RuntimeException(e);
    }
}