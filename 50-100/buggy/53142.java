private uk.ac.ebi.biostudy.submission.rest.user.UserSession getUserSession() {
    java.lang.String sessid = getSessionId();
    uk.ac.ebi.biostudy.submission.rest.providers.AuthenticationFilter.logger.debug(("sessionId=" + sessid));
    if (sessid == null) {
        return null;
    }
    uk.ac.ebi.biostudy.submission.rest.user.UserSession session = uk.ac.ebi.biostudy.submission.SessionAttributes.getUserSession(request);
    if (session == null) {
        session = new uk.ac.ebi.biostudy.submission.rest.user.UserSession(sessid);
        uk.ac.ebi.biostudy.submission.SessionAttributes.setUserSession(request, session);
    }
    return session;
}