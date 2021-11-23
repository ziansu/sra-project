@org.junit.Test
public void testEvent() {
    boolean ok = testDaoGeneric(new hlmng.model.Event("event", "description", "2014-01-01", "2014-01-01"), eventDao);
    assertTrue(ok);
}