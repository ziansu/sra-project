@org.junit.Test
public void lzw() {
    org.mapdb.DB db = maker().compressionEnable().make();
    db.hashMap("aa").put("aa", "bb");
    db.commit();
    assertEquals((1L << (Store.FEAT_COMP_LZF)), getBitField(db));
    db.close();
    try {
        maker().make();
        fail();
    } catch (org.mapdb.DBException e) {
        assertEquals("Store was created with compression, but no compression is enabled in config.", e.getMessage());
    }
}