@java.lang.Override
public void enableLink(long linkId, boolean enabled, java.sql.Connection conn) {
    try (java.sql.PreparedStatement enableConn = conn.prepareStatement(crudQueries.getStmtEnableLink())) {
        enableConn.setBoolean(1, enabled);
        enableConn.setLong(2, linkId);
        enableConn.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, linkId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0038, ex);
    }
}