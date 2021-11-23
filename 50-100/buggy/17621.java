public void testIsMinifiedTrue() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.String minified = "";
    for (int i = 0; i < 256; i++) {
        minified += "a";
    }
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified);
    assertTrue(sl.isMinified(codeLines, "something.something"));
}