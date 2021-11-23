protected void fireStateChanged(org.jsmpp.extra.SessionState newState, org.jsmpp.extra.SessionState oldState, org.jsmpp.session.Session source) {
    for (org.jsmpp.session.SessionStateListener l : sessionStateListeners) {
        try {
            l.onStateChange(newState, oldState, source);
        } catch (java.lang.Exception e) {
            org.jsmpp.session.AbstractSessionContext.logger.error(("Invalid runtime exception thrown when calling onStateChange for " + source), e);
        }
    }
}