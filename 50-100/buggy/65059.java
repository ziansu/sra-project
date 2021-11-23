private java.lang.String joinedTableNameFromIndividualQuery(java.lang.String query) {
    if ((query != null) && (!(query.isEmpty()))) {
        return null;
    }
    final java.lang.String[] splitQuery = query.split("=");
    if ((splitQuery.length) < 2) {
        return null;
    }
    return joinedTableNameFromRhs(splitQuery[1]);
}