@java.lang.Override
public void deleteJob(long jobId, java.sql.Connection conn) {
    try (java.sql.PreparedStatement dlt = conn.prepareStatement(crudQueries.getStmtDeleteJob())) {
        deleteJobInputs(jobId, conn);
        dlt.setLong(1, jobId);
        dlt.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, jobId);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0025, ex);
    }
}