public void testIsMinifiedTrue() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.StringBuilder minified = new java.lang.StringBuilder();
    for (int i = 0; i < 256; i++) {
        minified.append("a");
    }
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified.toString());
    assertTrue(sl.isMinified(codeLines, "something.something"));
}