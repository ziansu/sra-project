@org.junit.Test
public void givenSynonymFeatureDiabeledWhenIndexingDocumentsAndSearchForAWordThenNoDocumentContainTheWordsSynonymIsReturned() throws java.lang.Exception {
    java.lang.String synonymFileContent = "";
    setUpSynonymTests(synonymFileContent);
    java.lang.String text = "tv";
    condition = com.constellio.model.services.search.query.logical.LogicalSearchQueryOperators.fromAllSchemasIn(zeCollection).returnAll();
    com.constellio.model.services.search.query.logical.LogicalSearchQuery query = new com.constellio.model.services.search.query.logical.LogicalSearchQuery(condition).setFreeTextQuery(text);
    java.util.List<com.constellio.model.entities.records.Record> results = searchServices.search(query);
    org.assertj.core.api.Assertions.assertThat(results).containsOnly(tv);
}