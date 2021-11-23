@org.junit.BeforeClass
public static void setup() {
    try {
        TestDBHandler tdbh = new TestDBHandler();
        tdbh.eraseUserDBs();
        tdbh.createUserDBs();
        tdbh.addTestUsers(8);
        tdbh.generateRelation(1, 2, 1, 1);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("It works not!");
        e.printStackTrace();
    }
}