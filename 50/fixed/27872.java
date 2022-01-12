@org.junit.Test
public void write() throws java.lang.Exception {
    final java.io.StringWriter file = new java.io.StringWriter();
    config.write(file);
    java.lang.String out = file.toString();
    assertTrue(out.contains("int: 12"));
}