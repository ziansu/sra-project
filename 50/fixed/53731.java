@java.lang.Override
public void migrate(java.sql.Connection connection) throws java.io.IOException, java.sql.SQLException {
    checksum = org.dspace.storage.rdbms.MigrationUtils.dropDBConstraint(connection, "community", "name");
}