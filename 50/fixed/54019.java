@org.junit.Test
public void testGetVocabularyFolderVersions() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.VocabularyFolder> result = vocabularyService.getVocabularyFolderVersions("123", 1, "testUser");
    assertEquals("Number of other versions", 2, result.size());
}