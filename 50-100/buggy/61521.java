public void add(java.lang.String fieldName, java.util.List<java.lang.Object> values) {
    int i = 0;
    for (java.lang.Object value : values) {
        int column = getColumn(new org.apache.lucene.index.Term(fieldName, ((org.elasticsearch.vectorize.Vectorizer.MAGIC_SEP) + i)));
        if (column != (-1)) {
            coordQ.add(new org.elasticsearch.vectorize.Vectorizer.Coord(column, getValue(value)));
        }
        i++;
    }
}