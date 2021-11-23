public void add(org.apache.lucene.index.Term term, org.apache.lucene.search.TermStatistics termStatistics, int freq) {
    int column = getColumn(term);
    int data = getValue(term.field(), termStatistics, freq);
    if ((column != (-1)) && (data != 0)) {
        coordQ.add(new org.elasticsearch.vectorize.Vectorizer.Coord(column, data));
    }
}