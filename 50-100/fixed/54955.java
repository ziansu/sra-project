public void testIsBinaryEdge2() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.StringBuilder minified = new java.lang.StringBuilder();
    for (int i = 0; i < 96; i++) {
        minified.append("你");
    }
    minified.append("aaaa");
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified.toString());
    assertTrue(sl.isBinary(codeLines, "").isBinary());
}