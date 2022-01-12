public void clearLoadList(java.lang.String directory) throws com.linkedpipes.etl.executor.api.v1.LpException {
    try (java.sql.Connection connection = getSqlConnection()) {
        try (java.sql.PreparedStatement statement = com.linkedpipes.plugin.exec.virtuoso.SqlExecutor.prepareClearStatement(connection, directory)) {
            statement.executeUpdate();
        }
    } catch (java.sql.SQLException ex) {
        throw exceptionFactory.failure("Can't clear loading table.", ex);
    }
}