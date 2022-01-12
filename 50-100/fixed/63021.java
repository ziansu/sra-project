@org.junit.Test
public void testExtraTokenWithInitialsBug() throws java.io.IOException {
    java.lang.System.out.println("Testing SkrtWordTokenizer()\noutputs an empty token. couldn\'t find a way to prevent this from happening");
    java.lang.String input = "kanyA candravatI";
    java.io.Reader reader = new java.io.StringReader(input);
    java.util.List<java.lang.String> expected = java.util.Arrays.asList("kanya", "kana", "candravatI");
    java.lang.System.out.println(("0 " + input));
    io.bdrc.lucene.sa.SkrtWordTokenizer skrtWordTokenizer = new io.bdrc.lucene.sa.SkrtWordTokenizer("src/test/resources/tries/aTa_test.txt");
    org.apache.lucene.analysis.TokenStream syllables = io.bdrc.lucene.sa.SanskritAnalyzerTest.tokenize(reader, skrtWordTokenizer);
    io.bdrc.lucene.sa.SanskritAnalyzerTest.assertTokenStream(syllables, expected);
}