@org.junit.Test
public void xtea() {
    org.mapdb.DB db = maker().encryptionEnable("password").make();
    db.hashMap("aa").put("aa", "bb");
    db.commit();
    assertEquals((1L << (Store.FEAT_ENC_XTEA)), getBitField());
    db.close();
    try {
        maker().make();
        fail();
    } catch (org.mapdb.DBException e) {
        assertEquals("Store was created with encryption, but no password is set in config.", e.getMessage());
    }
}