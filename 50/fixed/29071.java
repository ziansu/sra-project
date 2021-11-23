@java.lang.Override
public void migrateUnit() throws java.sql.SQLException {
    if ((getVersionable().getSchema().getConnection()) != null) {
        getVersionable().getSchema().getConnection().createStatement().execute(sqlMigration);
    }
}