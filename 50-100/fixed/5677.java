@org.junit.Test
public void testDeleteVocabularyFolders() throws eionet.meta.service.ServiceException {
    vocabularyService.deleteVocabularyFolders(java.util.Collections.singletonList(1), false);
    java.lang.Exception exception = null;
    try {
        vocabularyService.getVocabularyFolder(1);
        fail("Expected vocabulary not found exception");
    } catch (eionet.meta.service.ServiceException e) {
        exception = e;
    }
    assertNotNull("Expected exception", exception);
}