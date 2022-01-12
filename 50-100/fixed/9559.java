@org.junit.Test
public void crc32_() {
    org.mapdb.DB db = maker().make();
    db.hashMap("aa").put("aa", "bb");
    db.commit();
    assertEquals(0L, getBitField(db));
    db.close();
    try {
        maker().checksumEnable().make();
        fail();
    } catch (org.mapdb.DBException e) {
        e.printStackTrace();
        assertEquals("Checksum us enabled, but store was created without it.", e.getMessage());
    }
}