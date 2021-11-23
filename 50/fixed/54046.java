@org.junit.Test
public void testGetVersion() {
    assertFalse("ERROR: Exception during call on server. Check log for details.", ((model) == null));
    java.lang.String str = model.Version();
    assertNotNull(str);
}