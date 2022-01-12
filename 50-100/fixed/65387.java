private void registerConfigDirection(java.lang.Long configId, org.apache.sqoop.common.Direction direction, java.sql.Connection conn) throws java.sql.SQLException {
    try (java.sql.PreparedStatement stmt = conn.prepareStatement(crudQueries.getStmtInsertSqConfigDirections())) {
        stmt.setLong(1, configId);
        stmt.setLong(2, getDirection(direction, conn));
        if ((stmt.executeUpdate()) != 1) {
            throw new org.apache.sqoop.common.SqoopException(org.apache.sqoop.error.code.CommonRepositoryError.COMMON_0042);
        }
    }
}