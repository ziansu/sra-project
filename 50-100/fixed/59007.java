public void testIsBinaryEdge1() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.StringBuilder minified = new java.lang.StringBuilder();
    for (int i = 0; i < 95; i++) {
        minified.append("你");
    }
    minified.append("aaaaa");
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified.toString());
    org.assertj.core.api.AssertionsForInterfaceTypes.assertThat(sl.isBinary(codeLines, "").isBinary()).isTrue();
}