@org.junit.Test
public void testGetInstance() throws java.lang.Exception {
    com.hp.gaia.sts.util.IDPConnectManager idpcm = com.hp.gaia.sts.util.DexConnectionManager.getInstance();
    assertNotNull(idpcm);
    assertEquals(idpcm.getClass(), com.hp.gaia.sts.util.DexConnectionManager.class);
    assertTrue((idpcm instanceof com.hp.gaia.sts.util.IDPConnectManager));
}