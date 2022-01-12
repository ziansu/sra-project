public base.Session getSessionWithId(java.lang.String id) {
    java.util.Iterator<base.Session> it = sessions.iterator();
    base.Session session = null;
    while (it.hasNext()) {
        session = it.next();
        if (id.equals(session.getSessionId())) {
            break;
        }
    } 
    if (session != null) {
        if (session.isExpired()) {
            session = null;
        }else {
            session.resetExpiryTime();
        }
    }
    return session;
}