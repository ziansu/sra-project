private java.lang.String analyzerName(java.lang.Class<?> entityType, org.hibernate.search.engine.metadata.impl.DocumentFieldMetadata fieldMetadata) {
    org.hibernate.search.analyzer.impl.AnalyzerReference analyzerReference = fieldMetadata.getAnalyzerReference();
    if (analyzerReference.is(org.hibernate.search.analyzer.impl.RemoteAnalyzerReference.class)) {
        return analyzerReference.unwrap(org.hibernate.search.analyzer.impl.RemoteAnalyzerReference.class).getAnalyzer().getName(fieldMetadata.getFieldName());
    }
    org.hibernate.search.elasticsearch.impl.ElasticsearchIndexManager.LOG.analyzerIsNotRemote(entityType, fieldMetadata.getFieldName(), analyzerReference);
    return null;
}