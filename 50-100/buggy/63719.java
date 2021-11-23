@org.junit.Before
public void createTestData() throws java.lang.Exception {
    org.skife.jdbi.v2.Handle handle = dbiProvider.get().open();
    liquibase.database.Database database = liquibase.database.DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new liquibase.database.jvm.JdbcConnection(handle.getConnection()));
    liquibase.Liquibase liquibase = new liquibase.Liquibase("singularity_test.sql", new liquibase.resource.FileSystemResourceAccessor(), database);
    liquibase.update(null);
    try {
        database.close();
    } catch (java.lang.Throwable t) {
    }
    handle.close();
}