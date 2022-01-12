protected org.apache.lucene.search.Query addField(org.apache.lucene.search.Query q, java.lang.String field) {
    _fieldNames.put(q, field);
    return q;
}