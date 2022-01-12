@org.junit.Test
public void testDeleteVocabularyConcepts() throws eionet.meta.service.ServiceException {
    vocabularyService.deleteVocabularyConcepts(java.util.Collections.singletonList(1));
    java.lang.Exception exception = null;
    try {
        vocabularyService.getVocabularyConcept(3, "concept1", true);
        org.junit.Assert.fail("Expected concept not found exception");
    } catch (eionet.meta.service.ServiceException e) {
        exception = e;
    }
    org.junit.Assert.assertNotNull("Expected exception", exception);
}