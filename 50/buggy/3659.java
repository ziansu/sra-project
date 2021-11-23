protected final boolean removeCommunicationSession(de.serviceflow.nutshell.cl.Session session) {
    java.lang.Object userObject = session.getUserObject();
    session.setUserObject(null);
    return sessions.remove(userObject, session);
}