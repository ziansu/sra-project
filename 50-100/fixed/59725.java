@java.lang.Override
public void deleteLinkInputs(long id, java.sql.Connection conn) {
    try (java.sql.PreparedStatement dltConnInput = conn.prepareStatement(crudQueries.getStmtDeleteLinkInput())) {
        dltConnInput.setLong(1, id);
        dltConnInput.executeUpdate();
    } catch (java.sql.SQLException ex) {
        logException(ex, id);
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0019, ex);
    }
}