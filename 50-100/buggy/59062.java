public void addFilterQuery(java.lang.String field, java.lang.String query, boolean negate) {
    if (negate) {
        this.filterQueriesNot.put(field, query.replace("\"", "\\\""));
    }else {
        this.filterQueries.put(field, query.replace("\"", "\\\""));
    }
}