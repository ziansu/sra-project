@java.lang.Override
public com.hypersocket.session.Session getNonCookieSession(java.lang.String remoteAddr, java.lang.String requestHeader, java.lang.String authenticationSchemeResourceKey) throws com.hypersocket.permissions.AccessDeniedException {
    java.lang.String key = createNonCookieSessionKey(remoteAddr, requestHeader, authenticationSchemeResourceKey);
    com.hypersocket.session.SessionServiceImpl.log.info(("REMOVEME: getting non-cookie session with key " + key));
    com.hypersocket.session.Session session = nonCookieSessions.get(key);
    if (session != null) {
        if (!(isLoggedOn(session, true))) {
            throw new com.hypersocket.permissions.AccessDeniedException();
        }
        return session;
    }
    throw new com.hypersocket.permissions.AccessDeniedException();
}