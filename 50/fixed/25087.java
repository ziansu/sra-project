@org.junit.Test
public void testGetVocabularyFoldersAnonymous() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.VocabularyFolder> result = vocabularyService.getVocabularyFolders(null);
    assertEquals("Result size", 7, result.size());
}