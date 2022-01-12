public void addFilterQuery(java.lang.String field, java.lang.String query, boolean negate) {
    if (negate) {
        this.filterQueriesNot.put(query.replace("\"", "\\\""), field);
    }else {
        this.filterQueries.put(query.replace("\"", "\\\""), field);
    }
}