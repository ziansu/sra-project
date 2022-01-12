@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getAllFields(javax.servlet.http.HttpServletRequest request) {
    if (isJsonPreferred(request)) {
        return JSON_BODY_RESOLVER.getAllFields(request);
    }
    return REQ_PARAM_RESOLVER.getAllFields(request);
}