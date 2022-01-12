@org.junit.Test
public void testFindPrinter() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> authors = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>() {
        {
            put("Author1", java.util.Arrays.asList("1", "2", "3"));
            put("Author2", java.util.Arrays.asList("22", "1"));
            put("Author3", java.util.Arrays.asList("3334"));
        }
    };
    assertEquals("Author3", findPrinter(authors));
    assertEquals(null, findPrinter(java.util.Collections.emptyMap()));
}