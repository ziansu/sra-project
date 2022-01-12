public org.graylog2.indexer.searches.SearchesConfig build() {
    if ((limit()) <= 0) {
        limit(org.graylog2.indexer.searches.SearchesConfig.DEFAULT_LIMIT);
    }
    return autoBuild();
}