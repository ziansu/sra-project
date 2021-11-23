@java.lang.Override
protected buzztaiki.lucene.lastuni.TokenStreamComponents createComponents(java.lang.String fieldName, java.io.Reader reader) {
    org.apache.lucene.analysis.cjk.CJKTokenizer source = new org.apache.lucene.analysis.cjk.CJKTokenizer(reader);
    return new buzztaiki.lucene.lastuni.TokenStreamComponents(source, new org.apache.lucene.analysis.StopFilter(matchVersion, new buzztaiki.lucene.lastuni.CJKLastUniGramFilter(new org.apache.lucene.analysis.cjk.CJKTokenizer(reader)), stopwords));
}