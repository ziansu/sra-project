@org.junit.Test
public void testGetVocabularyFoldersTestUser() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.VocabularyFolder> result = vocabularyService.getVocabularyFolders("testUser");
    org.junit.Assert.assertEquals("Result size", 8, result.size());
}