@org.junit.BeforeClass
public static void setup() throws java.lang.Exception {
    TestDBHandler tdbh = new TestDBHandler();
    tdbh.eraseUserDBs();
    tdbh.createUserDBs();
    tdbh.addTestUsers(8);
    tdbh.generateRelation(1, 2, 1, 1);
}