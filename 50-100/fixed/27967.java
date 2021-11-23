static void removeSession(org.zoodb.internal.server.SessionManager sm) {
    synchronized(org.zoodb.internal.server.SessionFactory.sessions) {
        if (!(org.zoodb.internal.server.SessionFactory.sessions.remove(sm))) {
            throw org.zoodb.internal.util.DBLogger.newFatalInternal(("Server session not found for: " + (sm.getPath())));
        }
        if ((org.zoodb.internal.server.SessionFactory.sessions.size()) <= 1) {
            org.zoodb.internal.server.SessionFactory.MULTIPLE_SESSIONS_ARE_OPEN = false;
        }
        if (org.zoodb.internal.server.SessionFactory.sessions.isEmpty()) {
            org.zoodb.internal.server.SessionFactory.FAIL_BECAUSE_OF_ACTIVE_NON_TX_READ = false;
        }
    }
}