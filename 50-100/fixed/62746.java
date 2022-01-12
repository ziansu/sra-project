@org.junit.Test
public void testWordPerLineShort() {
    try {
        java.util.Map<java.lang.CharSequence, java.lang.Integer> builtins_map = new com.example.wordcount.WordCount().runWithBuiltins(getText(com.example.wordcount.WordCountTest.TEXTFILE_WORD_PER_LINE_SHORT));
        java.util.Map<java.lang.CharSequence, java.lang.Integer> optimized_map = new com.example.wordcount.WordCount().runOptimized(getText(com.example.wordcount.WordCountTest.TEXTFILE_WORD_PER_LINE_SHORT));
        org.junit.Assert.assertEquals(builtins_map, optimized_map);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}