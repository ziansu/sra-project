@org.junit.BeforeClass
public static void setUp() throws java.sql.SQLException {
    char[] pass = "k^^pfp_^^s".toCharArray();
    for (int i = 1; i < ((pass.length) - 1); i++) {
        pass[i] += 3;
    }
    nl.tudelft.contextproject.saveLoad.ApplicationSettings.getInstance().setDatabaseInfo("159.253.0.125", 3306, "thomaaj84_test", "thomaaj84_test", new java.lang.String(pass));
    nl.tudelft.contextproject.saveLoad.ApplicationSettings.getInstance().setDatabaseName("thomaaj84_test");
    nl.tudelft.contextproject.databaseConnection.DatabaseConnectionTest.connection = nl.tudelft.contextproject.databaseConnection.DatabaseConnection.getInstance();
}