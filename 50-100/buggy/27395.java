@org.testng.annotations.Test
public void testInit() {
    final java.lang.String id = "test 1";
    final java.lang.String code = "var x = 3 + 7;";
    net.orzo.scripting.SourceCode src = new net.orzo.scripting.SourceCode(id, id, code);
    assertEquals(src.getContents(), code);
    assertEquals(src.getName(), id);
}