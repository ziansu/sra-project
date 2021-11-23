@org.junit.Before
public void before() throws java.io.IOException {
    analyzerFactory = new com.orientechnologies.lucene.analyzer.OLuceneAnalyzerFactory();
    java.lang.String metajson = com.orientechnologies.common.io.OIOUtils.readFileAsString(new java.io.File("./src/test/resources/index_metadata_new.json"));
    metadata = new com.orientechnologies.orient.core.record.impl.ODocument().fromJSON(metajson);
    indexDef = org.mockito.Mockito.mock(com.orientechnologies.orient.core.index.OIndexDefinition.class);
    org.mockito.Mockito.when(indexDef.getFields()).thenReturn(java.util.Arrays.asList("title", "author", "lyrics", "genre", "description"));
    org.mockito.Mockito.when(indexDef.getClassName()).thenReturn("Song");
}