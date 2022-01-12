@java.lang.Override
public java.util.List<org.apache.sqoop.model.MLink> findLinksForConnector(long connectorId, java.sql.Connection conn) {
    java.sql.PreparedStatement linkByConnectorFetchStmt = null;
    try {
        linkByConnectorFetchStmt = conn.prepareStatement(crudQueries.getStmtSelectLinkForConnectorConfigurable());
        linkByConnectorFetchStmt.setLong(1, connectorId);
        return loadLinks(linkByConnectorFetchStmt, conn);
    } catch (java.sql.SQLException ex) {
        logException(ex, connectorId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0020, ex);
    } finally {
        closeStatements(linkByConnectorFetchStmt);
    }
}