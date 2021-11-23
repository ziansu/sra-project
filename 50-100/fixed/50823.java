public void endSession(java.util.UUID uuid, long time) {
    main.java.com.djrapitops.plan.data.Session session = main.java.com.djrapitops.plan.systems.cache.SessionCache.activeSessions.get(uuid);
    if (session == null) {
        return ;
    }
    session.endSession(time);
    try {
        plugin.getDB().getSessionsTable().saveSession(uuid, session);
    } catch (java.sql.SQLException e) {
        main.java.com.djrapitops.plan.Log.toLog(this.getClass().getName(), e);
    } finally {
        main.java.com.djrapitops.plan.systems.cache.SessionCache.activeSessions.remove(uuid);
    }
}