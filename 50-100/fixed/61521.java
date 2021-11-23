public void add(java.lang.String fieldName, java.util.List<java.lang.Object> values) {
    int i = 0;
    for (java.lang.Object value : values) {
        int column = getColumn(new org.apache.lucene.index.Term(fieldName, ((org.elasticsearch.vectorize.Vectorizer.MAGIC_SEP) + i)));
        int data = getValue(value);
        if ((column != (-1)) && (data != 0)) {
            coordQ.add(new org.elasticsearch.vectorize.Vectorizer.Coord(column, data));
        }
        i++;
    }
}