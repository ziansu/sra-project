@java.lang.Override
public void execute(final java.sql.Connection connection) throws java.sql.SQLException {
    try (java.sql.Statement stmt = connection.createStatement()) {
        stmt.addBatch("SET REFERENTIAL_INTEGRITY FALSE");
        for (final java.lang.String table : tableNames) {
            stmt.addBatch(("DELETE FROM " + table));
        }
        stmt.addBatch("SET REFERENTIAL_INTEGRITY TRUE");
        stmt.executeBatch();
    }
}