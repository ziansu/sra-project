public java.lang.String getTopResultsForQuery(java.lang.String query, int k) throws java.io.IOException, org.apache.lucene.queryparser.classic.ParseException {
    _qPerformer = new queries.QueryPerformer(_index, _analyzer);
    _qPerformer.initialize(query);
    org.apache.lucene.search.TopDocs matches = _qPerformer.getTopK(k);
    org.apache.lucene.search.ScoreDoc[] hits = matches.scoreDocs;
    return printResults(hits);
}