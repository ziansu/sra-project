public org.apache.lucene.search.BooleanQuery createDeadlineQuery(java.util.Calendar deadline) throws itinerary.search.SearchException {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    org.apache.lucene.search.BooleanQuery bQuery = new org.apache.lucene.search.BooleanQuery();
    org.apache.lucene.search.TermRangeQuery rangeDeadlineQ = org.apache.lucene.search.TermRangeQuery.newStringRange(itinerary.search.Search.FIELD_DEADLINE, gson.toJson(deadline), gson.toJson(deadline), true, true);
    bQuery.add(rangeDeadlineQ, BooleanClause.Occur.MUST);
    return bQuery;
}