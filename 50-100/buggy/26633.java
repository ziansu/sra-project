@org.junit.Before
public void setUp() throws java.lang.Exception {
    java.lang.String id = "1";
    java.lang.String forename = "forename";
    java.lang.String surname = "surname";
    java.lang.String password = uk.ac.dundee.computing.quizbiz.lib.PasswordStorage.createHash("password");
    uk.ac.dundee.computing.quizbiz.stores.UserStore.Type type = uk.ac.dundee.computing.quizbiz.stores.UserStore.Type.STUDENT;
    instance = new uk.ac.dundee.computing.quizbiz.stores.UserStore(id, forename, surname, password, type);
}