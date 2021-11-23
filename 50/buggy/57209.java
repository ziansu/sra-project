protected com.alibaba.fastjson.JSONObject getSuccessResult(java.lang.Object result) {
    com.alibaba.fastjson.JSONObject object = createResult(true);
    object.put("root", result);
    return object;
}