@org.junit.Test
public void testUndoCheckOut() throws eionet.meta.service.ServiceException {
    vocabularyService.checkOutVocabularyFolder(1, "testUser");
    eionet.meta.dao.domain.VocabularyFolder workingCopy = vocabularyService.getVocabularyFolder("common", "test_vocabulary1", true);
    vocabularyService.undoCheckOut(workingCopy.getId(), "testUser");
    java.lang.Exception exception = null;
    try {
        vocabularyService.getVocabularyFolder("common", "test_vocabulary1", true);
        org.junit.Assert.fail("Expected vocabulary not found exception");
    } catch (eionet.meta.service.ServiceException e) {
        exception = e;
    }
    org.junit.Assert.assertNotNull("Expected exception", exception);
}