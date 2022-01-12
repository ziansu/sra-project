public void testIsBinaryEdge2() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.String minified = "";
    for (int i = 0; i < 96; i++) {
        minified += "你";
    }
    minified += "aaaa";
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified);
    assertTrue(sl.isBinary(codeLines, "").isBinary());
}