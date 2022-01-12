private org.eclipse.login.session.Session getSession(java.lang.String csrfToken, java.lang.String sessionID) {
    if (csrfToken != null) {
        org.eclipse.login.session.Session session = sessions.getIfPresent(sessionID);
        if ((session != null) && (session.getCSRFToken().equals(csrfToken))) {
            return session;
        }
    }
    return null;
}