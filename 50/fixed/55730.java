protected java.util.Map<java.lang.String, java.lang.Object> getFailureResult(java.lang.Object result, java.lang.Integer count) {
    java.util.Map<java.lang.String, java.lang.Object> jsonObject = getFailureResult(result);
    jsonObject.put("count", count);
    return jsonObject;
}