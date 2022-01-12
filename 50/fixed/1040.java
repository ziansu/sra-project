protected final void removeCommunicationSession(de.serviceflow.nutshell.cl.Session session) {
    java.lang.Object userObject = session.getUserObject();
    session.setUserObject(null);
    sessions.remove(userObject);
}