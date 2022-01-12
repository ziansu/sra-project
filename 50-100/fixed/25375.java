private synchronized org.jenkinsci.plugins.lucene.search.databackend.SearchBackend<?> getBackend() {
    if ((instance) == null) {
        org.jenkinsci.plugins.lucene.search.config.SearchBackendEngine engine = backendConfig.getSearchBackendEngine();
        switch (engine) {
            case LUCENE :
                instance = org.jenkinsci.plugins.lucene.search.databackend.LuceneSearchBackend.create(backendConfig.getConfig());
                break;
            case SOLR :
                instance = org.jenkinsci.plugins.lucene.search.databackend.SolrSearchBackend.create(backendConfig.getConfig());
                break;
            default :
                throw new java.lang.IllegalArgumentException(("Can't instantiate " + engine));
        }
    }
    return instance;
}