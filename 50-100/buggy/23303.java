@org.junit.Test
public void testBug923882asWriterWithEmptyCharArray() throws java.lang.Exception {
    java.io.StringWriter buffer = new java.io.StringWriter();
    org.neoxml.io.HTMLWriter writer = new org.neoxml.io.HTMLWriter(buffer, org.neoxml.io.OutputFormat.createPrettyPrint());
    writer.characters("wor".toCharArray(), 0, 3);
    writer.characters(new char[0], 0, 0);
    writer.characters("d-being-cut".toCharArray(), 0, 11);
    java.lang.String expected = "word-being-cut";
    assertEquals(expected, buffer.toString());
}