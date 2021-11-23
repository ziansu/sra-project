@java.lang.Override
public java.sql.Connection getConnection() throws java.sql.SQLException {
    State.State state = validatePoolState(isAllowConnectionAfterTermination());
    if (state == (WORKING)) {
        try {
            return getPooledConnection(getConnectionTimeoutInMs());
        } catch (java.sql.SQLException e) {
            if ((!(e.getSQLState().equals(org.vibur.dbcp.SQLSTATE_POOL_CLOSED_ERROR))) || (!(isAllowConnectionAfterTermination())))
                throw e;
            
        }
    }
    assert (getState()) == (TERMINATED);
    org.vibur.dbcp.ViburDBCPDataSource.logger.info("Calling getConnection() after the pool was closed; will create and return a non-pooled Connection.");
    return getNonPooledConnection();
}