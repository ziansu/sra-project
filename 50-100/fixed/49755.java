public int refresh(T data) throws java.sql.SQLException {
    checkForInitialized();
    if (data == null) {
        return 0;
    }
    if (data instanceof com.j256.ormlite.misc.BaseDaoEnabled) {
        @java.lang.SuppressWarnings(value = "unchecked")
        com.j256.ormlite.misc.BaseDaoEnabled<T, ID> daoEnabled = ((com.j256.ormlite.misc.BaseDaoEnabled<T, ID>) (data));
        daoEnabled.setDao(this);
    }
    com.j256.ormlite.support.DatabaseConnection connection = connectionSource.getReadOnlyConnection();
    try {
        return statementExecutor.refresh(connection, data, objectCache);
    } finally {
        connectionSource.releaseConnection(connection);
    }
}