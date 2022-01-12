public no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator getSpaces(java.util.Set<java.lang.Integer> uris) {
    if (uris.isEmpty())
        return new no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator(0, 0, "", "", "", "");
    
    return new no.uio.ifi.qure.dataprovider.DBDataProvider.DBUnparsedIterator(uris.size(), uris.size(), config.jdbcDriver, config.connectionStr, makeValuesQuery(uris), config.uriColumn);
}