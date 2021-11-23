@org.junit.Test
public void testUpdateVocabularyFolder() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyFolder(11);
    result.setLabel("modified");
    vocabularyService.updateVocabularyFolder(result, null);
    result = vocabularyService.getVocabularyFolder(11);
    assertEquals("Modified label", "modified", result.getLabel());
    java.lang.String baseUriExpected = (SITE_PREFIX) + "/vocabulary/common2/test_vocabulary11/";
    assertEquals("Generated Base Uri is not correct!", baseUriExpected, result.getBaseUri());
}