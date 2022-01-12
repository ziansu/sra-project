public com.android.baseline.framework.logic.InfoResult doParse(final java.lang.String response) throws com.alibaba.fastjson.JSONException {
    com.alibaba.fastjson.JSONObject jsonObject = com.alibaba.fastjson.JSON.parseObject(response.replace("\n", "&#xA;"));
    com.android.baseline.framework.logic.InfoResult infoResult = new com.android.baseline.framework.logic.InfoResult.Builder().success(jsonObject.getBooleanValue("success")).errorCode(jsonObject.getString("errorCode")).desc(jsonObject.getString("desc")).build();
    parseResponse(infoResult, jsonObject);
    return infoResult;
}