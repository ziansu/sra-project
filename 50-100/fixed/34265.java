@org.junit.Test
public void testReleasedVocabularyFolders() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.VocabularyFolder> releasedVocabularies = vocabularyService.getReleasedVocabularyFolders(1);
    int size = (releasedVocabularies == null) ? 0 : releasedVocabularies.size();
    assertEquals("Expected exactly 1 released vocabulary", 1, size);
    assertEquals("Expected released vocabulary with ID=2", 2, releasedVocabularies.iterator().next().getId());
}