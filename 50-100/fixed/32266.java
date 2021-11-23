private java.lang.String analyzerName(java.lang.Class<?> entityType, java.lang.String fieldName, org.hibernate.search.analyzer.impl.AnalyzerReference analyzerReference) {
    if (analyzerReference.is(org.hibernate.search.analyzer.impl.RemoteAnalyzerReference.class)) {
        return analyzerReference.unwrap(org.hibernate.search.analyzer.impl.RemoteAnalyzerReference.class).getAnalyzer().getName(fieldName);
    }
    org.hibernate.search.elasticsearch.impl.ElasticsearchIndexManager.LOG.analyzerIsNotRemote(entityType, fieldName, analyzerReference);
    return null;
}