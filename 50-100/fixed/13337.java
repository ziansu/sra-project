@java.lang.Override
public java.util.List<org.apache.sqoop.model.MConnector> findConnectors(java.sql.Connection conn) {
    try (java.sql.PreparedStatement stmt = conn.prepareStatement(crudQueries.getStmtSelectConfigurableAllForType())) {
        stmt.setString(1, MConfigurableType.CONNECTOR.name());
        return loadConnectors(stmt, conn);
    } catch (java.sql.SQLException ex) {
        logException(ex);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0041, ex);
    }
}