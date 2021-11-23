protected com.alibaba.fastjson.JSONObject getFailureResult(java.lang.Object result, java.lang.Integer count) {
    com.alibaba.fastjson.JSONObject jsonObject = getFailureResult(result);
    jsonObject.put("count", count);
    return jsonObject;
}