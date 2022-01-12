@org.junit.Test
public void ajoutVarTest() {
    d.setIdent("test5");
    d.ajoutVar();
    assertEquals(d.getErrorLog(), "");
    assertTrue(Yaka.tabIdent.existIdent("test5"));
    d.setIdent("test5");
    d.ajoutVar();
    assertNotEquals(d.getErrorLog(), "");
}