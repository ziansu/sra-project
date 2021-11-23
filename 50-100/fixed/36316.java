protected java.util.Map<java.lang.String, java.lang.Object> getFailureResult(java.lang.Object result) {
    java.util.Map<java.lang.String, java.lang.Object> object = createResult(false);
    if (result instanceof java.lang.Exception) {
        java.lang.Exception e = ((java.lang.Exception) (result));
        object.put("root", com.shinemo.mydb.util.ExceptionProcessUtils.getThrowableMessage(e));
    }else {
        object.put("root", result);
    }
    return object;
}