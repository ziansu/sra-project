@org.junit.Test
public void testSearchVocabulariesExactMatch() throws java.lang.Exception {
    eionet.meta.service.data.VocabularyFilter filter = new eionet.meta.service.data.VocabularyFilter();
    filter.setText("est1");
    filter.setExactMatch(true);
    eionet.meta.service.data.VocabularyResult result = vocabularyService.searchVocabularies(filter);
    assertEquals(result.getTotalItems(), 0);
    filter.setExactMatch(false);
    result = vocabularyService.searchVocabularies(filter);
    assertEquals(result.getTotalItems(), 1);
}