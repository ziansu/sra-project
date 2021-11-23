private static void validateSqlDatabaseNotFound(java.lang.String newDatabase) {
    try {
        sqlServerManager.sqlDatabases().getBySqlServer(com.microsoft.azure.management.sql.SqlServerOperationsTests.RG_NAME, com.microsoft.azure.management.sql.SqlServerOperationsTests.SQL_SERVER_NAME, com.microsoft.azure.management.sql.SqlServerOperationsTests.SQL_DATABASE_NAME);
        org.junit.Assert.assertTrue(false);
    } catch (com.microsoft.azure.CloudException exception) {
        org.junit.Assert.assertEquals(exception.getResponse().code(), 404);
    }
}