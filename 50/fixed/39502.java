protected static com.alibaba.fastjson.JSONObject getErrorMsgInJson(java.lang.String errorMsg) {
    com.alibaba.fastjson.JSONObject errorMsgJson = new com.alibaba.fastjson.JSONObject();
    errorMsgJson.put("ERROR", errorMsg);
    return errorMsgJson;
}