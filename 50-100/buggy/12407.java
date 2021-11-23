public org.netpreserve.commons.uri.UriBuilder query(final java.lang.String value) {
    query = config.getParser().validateQuery(this, value, 0, (-1));
    if ((query) == null) {
        throw new org.netpreserve.commons.uri.UriException(("Illegal query: " + value));
    }
    parsedQuery = null;
    return this;
}