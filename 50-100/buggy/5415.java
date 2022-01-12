private azkaban.server.session.Session getSessionFromSessionId(java.lang.String sessionId, java.lang.String remoteIp) {
    if (sessionId == null) {
        return null;
    }
    azkaban.server.session.Session session = getApplication().getSessionCache().getSession(sessionId);
    if ((session == null) || (!(remoteIp.equals(session.getIp())))) {
        return null;
    }
    return session;
}