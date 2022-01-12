private org.dellroad.msrp.Session findSession(org.dellroad.msrp.MsrpUri localURI) {
    assert localURI != null;
    org.dellroad.msrp.Session session = this.sessionMap.get(localURI);
    if ((session != null) || (!(this.matchSessionId)))
        return session;
    
    final java.lang.String sessionId = localURI.getSessionId();
    for (org.dellroad.msrp.Session session2 : this.sessionMap.values()) {
        if (session2.getLocalUri().getSessionId().equals(sessionId))
            return session2;
        
    }
    return null;
}