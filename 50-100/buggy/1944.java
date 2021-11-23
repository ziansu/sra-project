@org.fusesource.leveldbjni.test.Ignore
@org.fusesource.leveldbjni.test.Test
public void testSeekFound() {
    setUp();
    fillDatabase();
    org.fusesource.leveldbjni.test.DBIterator it = db.iterator();
    it.seek(toByteArray(((byte) (2))));
    assertEquals(3, it.peekNext().getKey()[0]);
}