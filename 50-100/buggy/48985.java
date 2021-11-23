@java.lang.Override
public void dropTable(java.lang.String tableName) {
    try (java.sql.Statement stmt = connection.createStatement()) {
        stmt.executeUpdate(java.lang.String.format("DROP TABLE \"%s\"", tableName));
    } catch (java.sql.SQLException ex) {
        throw new java.lang.IllegalArgumentException(ex.getMessage());
    }
}