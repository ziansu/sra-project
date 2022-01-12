@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
private <S> void initializeTypedConverter(java.util.Map<java.lang.String, ?> source, java.lang.Class<? extends S> rawType) {
    getConversionService().addConverter(((java.lang.Class) (source.getClass())), ((java.lang.Class) (rawType)), new org.springframework.data.solr.core.convert.SolrjConverters.SolrInputDocumentToObjectConverter<S>(((Class<org.springframework.data.solr.core.convert.S>) (rawType))));
}