@java.lang.Override
public java.util.List<org.apache.sqoop.model.MJob> findJobsForConnector(long connectorId, java.sql.Connection conn) {
    try (java.sql.PreparedStatement stmt = conn.prepareStatement(crudQueries.getStmtSelectAllJobsForConnectorConfigurable())) {
        stmt.setLong(1, connectorId);
        stmt.setLong(2, connectorId);
        return loadJobs(stmt, conn);
    } catch (java.sql.SQLException ex) {
        logException(ex, connectorId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0028, ex);
    }
}