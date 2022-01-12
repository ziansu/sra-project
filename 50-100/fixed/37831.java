@com.instrumentalapp.BeforeClass
public static void setUp() throws java.lang.Exception {
    try {
        java.util.Scanner scanner = new java.util.Scanner(new java.io.File("test_key"));
        com.instrumentalapp.AgentTest.apiKey = scanner.useDelimiter("\\A").next();
    } catch (java.io.FileNotFoundException e) {
        com.instrumentalapp.Assert.assertTrue("Please put the test project key into file 'test_key' in the project root", false);
    }
}