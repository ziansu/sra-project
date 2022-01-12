static void clearExpiredSessions() {
    long now = java.lang.System.nanoTime();
    for (int i = (me.smartproxy.core.NatSessionManager.Sessions.size()) - 1; i >= 0; i--) {
        me.smartproxy.core.NatSession session = me.smartproxy.core.NatSessionManager.Sessions.valueAt(i);
        if ((session != null) && ((now - (session.LastNanoTime)) > (me.smartproxy.core.NatSessionManager.SESSION_TIMEOUT_NS))) {
            me.smartproxy.core.NatSessionManager.Sessions.removeAt(i);
        }
    }
}