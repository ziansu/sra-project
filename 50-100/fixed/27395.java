@org.testng.annotations.Test
public void testInit() {
    final java.lang.String id = "test 1";
    final java.lang.String code = "var x = 3 + 7;";
    net.orzo.scripting.SourceCode src = new net.orzo.scripting.SourceCode(id, id, code);
    org.testng.Assert.assertEquals(src.getContents(), code);
    org.testng.Assert.assertEquals(src.getName(), id);
}