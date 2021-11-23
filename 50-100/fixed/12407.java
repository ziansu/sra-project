public org.netpreserve.commons.uri.UriBuilder query(final java.lang.String value) {
    if (value == null) {
        query = null;
    }else {
        query = config.getParser().validateQuery(this, value, 0, (-1));
    }
    parsedQuery = null;
    return this;
}