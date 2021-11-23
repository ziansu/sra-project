public void setSession(org.eclipse.persistence.internal.sessions.AbstractSession session) {
    if (session != null) {
        this.session = session.getRootSession(null);
    }else {
        this.session = null;
    }
}