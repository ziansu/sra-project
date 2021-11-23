@org.testng.annotations.Test
public void testInitByNullValues() {
    net.orzo.scripting.SourceCode src = new net.orzo.scripting.SourceCode(null, null, null);
    assertEquals(src.getName(), "unnamed");
    assertEquals(src.getContents(), "");
}