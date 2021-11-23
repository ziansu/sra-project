public void explain(org.apache.lucene.search.Query query, org.apache.lucene.search.ScoreDoc[] hits) throws java.io.IOException {
    for (int i = 0; i < (it.uniroma3.searchweb.engine.searcher.DebuggerSearchEngine.TOP_SCORES); i++) {
        org.apache.lucene.search.Explanation expl = this.searcher.explain(query, hits[i].doc);
        it.uniroma3.searchweb.engine.searcher.DebuggerSearchEngine.logger.info(((("Match " + (i + 1)) + " explanation:\n") + (expl.toString())));
    }
}