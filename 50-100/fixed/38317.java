@org.junit.Before
public void setUp() throws java.lang.Exception {
    library = getTestLibrary();
    com.twu.biblioteca.UserDatabase database = new com.twu.biblioteca.UserDatabase();
    database.add(getTestUser());
    database.add(getTestAdmin());
    loginValidator = new com.twu.biblioteca.LoginValidator(database);
    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    outputStream = new java.io.PrintStream(byteArrayOutputStream);
}