@org.junit.After
public void tearDown() throws java.lang.Exception {
    _hWPFDocFixture.tearDown();
    _hWPFDocFixture = null;
    java.lang.System.setProperty("org.apache.poi.hwpf.preserveTextTable", java.lang.Boolean.FALSE.toString());
}