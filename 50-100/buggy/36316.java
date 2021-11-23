protected com.alibaba.fastjson.JSONObject getFailureResult(java.lang.Object result) {
    com.alibaba.fastjson.JSONObject object = createResult(false);
    if (result instanceof java.lang.Exception) {
        java.lang.Exception e = ((java.lang.Exception) (result));
        object.put("root", com.shinemo.mydb.util.ExceptionProcessUtils.getThrowableMessage(e));
    }else {
        object.put("root", result);
    }
    return object;
}