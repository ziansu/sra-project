@org.junit.Test
public void testSearchVocabularyConceptsByIdentifier() throws eionet.meta.service.ServiceException {
    eionet.meta.service.data.VocabularyConceptFilter filter = new eionet.meta.service.data.VocabularyConceptFilter();
    filter.setText("1234");
    eionet.meta.service.data.VocabularyConceptResult result = vocabularyService.searchVocabularyConcepts(filter);
    org.junit.Assert.assertEquals("Result size", 1, result.getFullListSize());
}