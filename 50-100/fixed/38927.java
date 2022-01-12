public java.util.List<es.ua.labidiomas.corpus.searcher.LuceneSnippet> getSnippets(int termSize, java.util.List<es.ua.labidiomas.corpus.searcher.LuceneSnippet> snippets, org.apache.lucene.search.ScoreDoc sd, org.apache.lucene.search.IndexSearcher indexSearcher, java.sql.Connection connection, org.apache.lucene.analysis.Analyzer analyzer, org.apache.lucene.search.highlight.Highlighter textHighlighter, boolean isTitle, boolean isBilingual) throws java.io.IOException, java.sql.SQLException, org.apache.lucene.search.highlight.InvalidTokenOffsetsException {
    if (isTitle) {
        return getTitleSnippets(termSize, snippets, sd, indexSearcher, connection, analyzer, textHighlighter, isBilingual);
    }else {
        return getTextSnippets(termSize, snippets, sd, indexSearcher, connection, analyzer, textHighlighter, isBilingual);
    }
}