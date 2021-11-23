private static void assertSandhi(java.lang.String input, java.util.List<java.lang.String> expected, int trieNumber) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.Reader reader = new java.io.StringReader(input);
    java.lang.System.out.println(("0 " + input));
    io.bdrc.lucene.sa.SkrtWordTokenizer skrtWordTokenizer = new io.bdrc.lucene.sa.SkrtWordTokenizer((("resources/sanskrit-stemming-data/output/tries/" + (java.lang.Integer.toString(trieNumber))) + ".txt"));
    org.apache.lucene.analysis.TokenStream syllables = io.bdrc.lucene.sa.SandhiTests.tokenize(reader, skrtWordTokenizer);
    io.bdrc.lucene.sa.SandhiTests.assertTokenStream(syllables, expected);
}