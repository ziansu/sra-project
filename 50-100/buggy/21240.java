private boolean dropTable(java.lang.String table) throws org.openhds.controller.exception.ConstraintViolations {
    java.lang.String tableName = ((schemaName) + ".") + table;
    java.lang.String sql = ("DROP TABLE " + tableName) + ";";
    try (java.sql.Connection connection = dataSource.getConnection();java.sql.Statement stmt = connection.createStatement()) {
        int rowCount = stmt.executeUpdate(sql);
        return true;
    } catch (java.sql.SQLException sqlException) {
        throw new org.openhds.controller.exception.ConstraintViolations(("Could not drop table " + table));
    }
}