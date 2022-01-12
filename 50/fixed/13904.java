public no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator getSpaces() {
    int total = queryForTotal(config.geoTableName);
    return new no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator(total, config.limit, config.jdbcDriver, config.connectionStr, config.geoQuerySelectFromStr, config.uriColumn, true);
}