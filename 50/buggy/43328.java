@org.junit.Test
public void shouldRemoveAllPipes() {
    java.util.List<java.lang.String> results = norm.createMappings("bar|tu|c|h");
    assertEquals("bartuch", results.get(0));
}