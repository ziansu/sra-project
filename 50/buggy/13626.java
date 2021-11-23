public void setSession(org.eclipse.persistence.internal.sessions.AbstractSession session) {
    this.session = session.getRootSession(null);
}