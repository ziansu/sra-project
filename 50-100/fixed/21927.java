private org.apache.lucene.search.BooleanQuery createQuery(java.lang.String field, java.lang.String Query) {
    java.lang.String[] splitQuery = Query.split(" ");
    org.apache.lucene.search.BooleanQuery bQuery = new org.apache.lucene.search.BooleanQuery();
    org.apache.lucene.search.Query wildQ = getWildCardQuery(field, splitQuery);
    org.apache.lucene.search.Query fuzzyQ = getFuzzyQuery(field, splitQuery);
    bQuery.add(fuzzyQ, BooleanClause.Occur.SHOULD);
    bQuery.add(wildQ, BooleanClause.Occur.SHOULD);
    return bQuery;
}