@org.testng.annotations.Test
public void testInitByNullValues() {
    net.orzo.scripting.SourceCode src = new net.orzo.scripting.SourceCode(null, null, null);
    org.testng.Assert.assertEquals(src.getName(), "unnamed");
    org.testng.Assert.assertEquals(src.getContents(), "");
}