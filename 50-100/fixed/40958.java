@java.lang.Override
public org.avidj.zuul.core.Session getSession(java.lang.String id) {
    org.avidj.zuul.core.Session session = sessions.get(id);
    if (session != null) {
        session.cancelTimeout();
    }
    if (session == null) {
        session = new org.avidj.zuul.core.Session(this, id);
        sessions.put(id, session);
    }
    synchronized(this) {
        sessionTimer.schedule(session.newTimeoutTask(), sessionTimeout);
    }
    return session;
}