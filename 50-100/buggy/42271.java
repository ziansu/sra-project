@java.lang.Override
public void purgeSubmissions(java.util.Date threshold, java.sql.Connection conn) {
    java.sql.PreparedStatement stmt = null;
    try {
        stmt = conn.prepareStatement(crudQueries.getStmtPurgeSubmissions());
        stmt.setTimestamp(1, new java.sql.Timestamp(threshold.getTime()));
        stmt.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, threshold);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0033, ex);
    } finally {
        closeStatements(stmt);
    }
}