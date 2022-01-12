@java.lang.Override
public int getLoginTimeout() throws java.sql.SQLException {
    return originalDataSource.getLoginTimeout();
}