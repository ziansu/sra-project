public no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator getExternalOverlapping(java.lang.String whereClause) {
    java.lang.String query = config.geoQuerySelectFromStr;
    query += " WHERE " + whereClause;
    int total = queryForTotal(config.geoTableName);
    return new no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator(total, config.limit, config.jdbcDriver, config.connectionStr, query, config.uriColumn, false);
}