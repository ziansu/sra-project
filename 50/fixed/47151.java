public static void clear() {
    synchronized(org.zoodb.internal.server.SessionFactory.sessions) {
        org.zoodb.internal.server.SessionFactory.sessions.clear();
        org.zoodb.internal.server.SessionFactory.FAIL_BECAUSE_OF_ACTIVE_NON_TX_READ = false;
        org.zoodb.internal.server.SessionFactory.MULTIPLE_SESSIONS_ARE_OPEN = false;
    }
}