public void testSplitKeywords2() {
    com.searchcode.app.util.SearchcodeLib sl = new com.searchcode.app.util.SearchcodeLib();
    java.lang.String actual = sl.splitKeywords("map.put(\"isCommunity\", ISCOMMUNITY);");
    org.assertj.core.api.AssertionsForInterfaceTypes.assertThat(actual).contains("is Community");
}