@java.lang.Override
public java.lang.String getRequestedSessionId(final javax.servlet.http.HttpServletRequest request) {
    final java.util.Map<java.lang.String, java.lang.String> sessionIds = getSessionIds(request);
    final java.lang.String sessionAlias = getCurrentSessionAlias(request);
    return sessionIds.get(sessionAlias);
}