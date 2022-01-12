@java.lang.SuppressWarnings(value = "unchecked")
private <S> void initializeTypedConverter(java.util.Map<java.lang.String, ?> source, java.lang.Class<? extends S> rawType) {
    getConversionService().addConverter(source.getClass(), rawType, new org.springframework.data.solr.core.convert.SolrjConverters.SolrInputDocumentToObjectConverter<S>(((Class<org.springframework.data.solr.core.convert.S>) (rawType))));
}