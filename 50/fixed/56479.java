private float getFloatValue(com.alibaba.fastjson.JSONObject json, java.lang.String key) {
    try {
        return json.getFloatValue(key);
    } catch (java.lang.Exception e) {
        return 0.0F;
    }
}