@org.junit.Test
public void testUnknownTableJobGetsRemoved() throws java.lang.Exception {
    execute("set global stats.enabled=true");
    ensureYellow();
    try {
        execute("select * from foobar");
    } catch (io.crate.action.sql.SQLActionException e) {
        assertEquals(e.getMessage(), "Table 'foobar' unknown");
    }
    execute("select * from sys.jobs");
    assertEquals(response.rowCount(), 1L);
    execute("reset global stats.enabled");
}