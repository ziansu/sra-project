private void insertConfigInputRelationship(java.lang.Long parent, java.lang.Long child, java.sql.Connection conn) {
    java.sql.PreparedStatement baseInputRelationStmt = null;
    try {
        baseInputRelationStmt = conn.prepareStatement(crudQueries.getStmtInsertIntoInputRelation());
        baseInputRelationStmt.setLong(1, parent);
        baseInputRelationStmt.setLong(2, child);
        baseInputRelationStmt.executeUpdate();
    } catch (java.sql.SQLException ex) {
        throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0047, ex);
    } finally {
        closeStatements(baseInputRelationStmt);
    }
}