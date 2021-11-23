@org.junit.Before
public void setup() {
    testDatabase = new com.distroguy.jContacts.Database(com.distroguy.jContacts.TestDatabase.TESTFILE);
    testOrganiser = new com.distroguy.jContacts.Organiser();
}