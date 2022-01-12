public void testIsMinifiedFalse() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.String minified = "";
    for (int i = 0; i < 255; i++) {
        minified += "a";
    }
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified);
    assertFalse(sl.isMinified(codeLines, "something.something"));
}