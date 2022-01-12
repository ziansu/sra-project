@org.junit.Test
public void xtea2() {
    org.mapdb.DB db = maker().make();
    db.hashMap("aa").put("aa", "bb");
    db.commit();
    assertEquals(0L, getBitField());
    db.close();
    try {
        maker().encryptionEnable("password").make();
        fail();
    } catch (org.mapdb.DBException e) {
        assertEquals("Password is set, but store is not encrypted.", e.getMessage());
    }
}