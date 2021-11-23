@org.junit.Test
public void lzw2() {
    org.mapdb.DB db = maker().make();
    db.hashMap("aa").put("aa", "bb");
    db.commit();
    assertEquals(0L, getBitField());
    db.close();
    try {
        maker().compressionEnable().make();
        fail();
    } catch (org.mapdb.DBException e) {
        assertEquals("Compression is set in config, but store was created with compression.", e.getMessage());
    }
}