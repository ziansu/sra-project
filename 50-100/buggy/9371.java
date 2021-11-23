public void insertLoadRecord(java.lang.String directory, java.lang.String fileName, java.lang.String graph) throws com.linkedpipes.etl.executor.api.v1.LpException {
    try (java.sql.Connection connection = getSqlConnection()) {
        try (java.sql.PreparedStatement statement = com.linkedpipes.plugin.exec.virtuoso.SqlExecutor.createLdStatement(connection, directory, fileName, graph)) {
            statement.executeQuery();
        }
    } catch (java.sql.SQLException ex) {
        throw exceptionFactory.failure("Can't execute ld_dir query.", ex);
    }
}