public void add(org.apache.lucene.index.Term term, org.apache.lucene.search.TermStatistics termStatistics, int freq) {
    int column = getColumn(term);
    if (column != (-1)) {
        coordQ.add(new org.elasticsearch.vectorize.Vectorizer.Coord(column, getValue(term.field(), termStatistics, freq)));
    }
}