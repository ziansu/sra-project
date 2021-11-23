private java.lang.String buildSortAndClause(java.lang.String sortOrder, java.lang.String limit, java.lang.String offset) {
    java.lang.String limitClause = "";
    if (!(android.text.TextUtils.isEmpty(limit))) {
        limitClause = " LIMIT " + limit;
    }
    if (!(android.text.TextUtils.isEmpty(offset))) {
        limitClause = (limitClause + " OFFSET ") + offset;
    }
    java.lang.String clause = (sortOrder == null) ? " 1" + limitClause : sortOrder + limitClause;
    return clause;
}