@Before
public void setUp() throws java.lang.Exception {
    db = new PostgresDB("blockchain_test", "furkansahin", "", true);
    assertNotEquals(null, db);
}