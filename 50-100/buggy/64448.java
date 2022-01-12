public static java.lang.String getSQLSelectString(org.mapsforge.poi.storage.PoiCategoryFilter filter, java.lang.String[] patterns) {
    java.lang.String query = (DbConstants.FIND_IN_BOX_STATEMENT) + (org.mapsforge.poi.storage.PoiCategoryRangeQueryGenerator.getSQLWhereClauseString(filter));
    if (patterns != null) {
        for (java.lang.String ignored : patterns) {
            query += DbConstants.FIND_BY_DATA_CLAUSE;
        }
    }
    return query + " LIMIT ?;";
}