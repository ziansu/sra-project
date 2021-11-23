@org.junit.Test
public void testGetIdentifier() {
    java.lang.String tableName = "tableName";
    de.metanome.backend.results_db.DatabaseConnection connection = new de.metanome.backend.results_db.DatabaseConnection();
    connection.setUrl("url");
    connection.setPassword("pwd");
    connection.setSystem(DbSystem.DB2);
    connection.setUsername("user");
    java.lang.String expectedIdentifier = "tableName; url; user; DB2";
    de.metanome.backend.results_db.TableInput input = new de.metanome.backend.results_db.TableInput();
    input = input.setDatabaseConnection(connection);
    input.setTableName("tableName");
    java.lang.String actualIdentifier = input.getIdentifier();
    org.junit.Assert.assertEquals(expectedIdentifier, actualIdentifier);
}