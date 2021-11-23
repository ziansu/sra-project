@java.lang.Override
public void enableLink(long linkId, boolean enabled, java.sql.Connection conn) {
    java.sql.PreparedStatement enableConn = null;
    try {
        enableConn = conn.prepareStatement(crudQueries.getStmtEnableLink());
        enableConn.setBoolean(1, enabled);
        enableConn.setLong(2, linkId);
        enableConn.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, linkId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0038, ex);
    } finally {
        closeStatements(enableConn);
    }
}