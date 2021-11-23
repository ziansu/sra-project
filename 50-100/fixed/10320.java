@org.junit.Test
public void shouldRegisterIndexes_withIndexDefinitions() throws java.lang.Exception {
    final java.util.Collection<com.clicktravel.cheddar.infrastructure.persistence.document.search.configuration.IndexDefinition> indexDefinitions = java.util.Arrays.asList(new com.clicktravel.cheddar.infrastructure.persistence.document.search.configuration.IndexDefinition("stringProperty", IndexFieldType.LITERAL));
    final java.lang.String namespace = com.clicktravel.common.random.Randoms.randomString(10);
    final java.lang.Class<? extends com.clicktravel.cheddar.infrastructure.persistence.document.search.Document> documentClass = com.clicktravel.cheddar.infrastructure.persistence.document.search.configuration.StubDocument.class;
    final com.clicktravel.cheddar.infrastructure.persistence.document.search.configuration.DocumentConfiguration documentConfiguration = new com.clicktravel.cheddar.infrastructure.persistence.document.search.configuration.DocumentConfiguration(documentClass, namespace);
    documentConfiguration.registerIndexes(indexDefinitions);
    org.junit.Assert.assertEquals(new java.util.ArrayList(indexDefinitions), new java.util.ArrayList(documentConfiguration.indexDefinitions()));
}