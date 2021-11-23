@java.lang.Override
public void migrate(java.sql.Connection connection) throws java.io.IOException, java.sql.SQLException {
    int return1 = org.dspace.storage.rdbms.MigrationUtils.dropDBConstraint(connection, "community2collection", "collection_id", "fkey");
    int return2 = org.dspace.storage.rdbms.MigrationUtils.dropDBConstraint(connection, "community2community", "child_comm_id", "fkey");
    int return3 = org.dspace.storage.rdbms.MigrationUtils.dropDBConstraint(connection, "collection2item", "item_id", "fkey");
    checksum = (return1 + return2) + return3;
}