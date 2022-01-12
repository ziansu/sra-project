public void testIsBinaryEdge1() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.String minified = "";
    for (int i = 0; i < 95; i++) {
        minified += "你";
    }
    minified += "aaaaa";
    java.util.ArrayList<java.lang.String> codeLines = new java.util.ArrayList<>();
    codeLines.add(minified);
    org.assertj.core.api.AssertionsForInterfaceTypes.assertThat(sl.isBinary(codeLines, "").isBinary()).isTrue();
}