@java.lang.Override
protected Analyzer.TokenStreamComponents createComponents(java.lang.String fieldName) {
    final org.apache.lucene.analysis.Tokenizer source;
    source = (search) ? new br.bireme.ngrams.NGTokenizer(ngramSize) : new org.apache.lucene.analysis.ngram.NGramTokenizer(ngramSize, ngramSize);
    return new org.apache.lucene.analysis.Analyzer.TokenStreamComponents(source);
}