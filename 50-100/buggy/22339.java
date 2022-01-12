@java.lang.Override
public void deleteJob(long jobId, java.sql.Connection conn) {
    java.sql.PreparedStatement dlt = null;
    try {
        deleteJobInputs(jobId, conn);
        dlt = conn.prepareStatement(crudQueries.getStmtDeleteJob());
        dlt.setLong(1, jobId);
        dlt.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, jobId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0025, ex);
    } finally {
        closeStatements(dlt);
    }
}