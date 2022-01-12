@java.lang.Override
public java.util.List<org.apache.sqoop.model.MJob> findJobs(java.sql.Connection conn) {
    try (java.sql.PreparedStatement stmt = conn.prepareStatement(crudQueries.getStmtSelectJobAllWithOrder())) {
        return loadJobs(stmt, conn);
    } catch (java.sql.SQLException ex) {
        logException(ex);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0028, ex);
    }
}