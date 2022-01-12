@org.junit.Test
public void testCheckOutVocabularyFolder() throws eionet.meta.service.ServiceException {
    vocabularyService.checkOutVocabularyFolder(1, "testUser");
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyFolder("common", "test_vocabulary1", true);
    assertNotNull("Working copy vocabulary", result);
    assertEquals("Working user", "testUser", result.getWorkingUser());
    assertEquals("Working copy", true, result.isWorkingCopy());
    assertEquals("Checked out copy id", 1, result.getCheckedOutCopyId());
}