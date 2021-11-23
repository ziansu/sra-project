@org.junit.Test
public void testGetVersion() {
    java.lang.String str = model.Version();
    assertFalse("ERROR: Exception during call on server. Check log for details.", ((model) == null));
    assertEquals("1.1", str);
}