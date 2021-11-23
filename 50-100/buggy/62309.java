@java.lang.Override
public synchronized void close() {
    try {
        switch (state.type) {
            case ZERO :
                break;
            case NORMAL :
            case ELEVATED :
                if (com.palantir.nexus.db.pool.HikariCPConnectionManager.log.isDebugEnabled()) {
                    com.palantir.nexus.db.pool.HikariCPConnectionManager.log.debug("Closing connection pool: {}", connConfig, new java.lang.RuntimeException("Closing connection pool"));
                }
                state.dataSourcePool.close();
                break;
            case CLOSED :
                break;
        }
    } finally {
        state = new com.palantir.nexus.db.pool.HikariCPConnectionManager.State(com.palantir.nexus.db.pool.HikariCPConnectionManager.StateType.CLOSED, 0, null, null, new java.lang.Throwable("Hikari pool closed here"));
    }
}