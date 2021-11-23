@org.junit.Test
public void testCheckOutVocabularyFolder() throws eionet.meta.service.ServiceException {
    vocabularyService.checkOutVocabularyFolder(1, "testUser");
    eionet.meta.dao.domain.VocabularyFolder result = vocabularyService.getVocabularyFolder("common", "test_vocabulary1", true);
    org.junit.Assert.assertNotNull("Working copy vocabulary", result);
    org.junit.Assert.assertEquals("Working user", "testUser", result.getWorkingUser());
    org.junit.Assert.assertEquals("Working copy", true, result.isWorkingCopy());
    org.junit.Assert.assertEquals("Checked out copy id", 1, result.getCheckedOutCopyId());
}