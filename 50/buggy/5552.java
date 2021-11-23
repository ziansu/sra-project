public java.lang.String getRequestedSessionId(javax.servlet.http.HttpServletRequest request) {
    java.util.Map<java.lang.String, java.lang.String> sessionIds = getSessionIds(request);
    java.lang.String sessionAlias = getCurrentSessionAlias(request);
    return sessionIds.get(sessionAlias);
}