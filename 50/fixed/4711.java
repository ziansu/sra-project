protected org.apache.lucene.search.Filter getSecureFilter() throws java.io.IOException {
    return _accessControlReader.getQueryFilter();
}