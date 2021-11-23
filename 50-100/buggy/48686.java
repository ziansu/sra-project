@org.junit.Test
public void testUpdateVocabularyConcept() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.VocabularyConcept result = vocabularyService.getVocabularyConcept(3, "concept1", true);
    result.setLabel("modified");
    vocabularyService.updateVocabularyConcept(result);
    result = vocabularyService.getVocabularyConcept(3, "concept1", true);
    org.junit.Assert.assertEquals("Modified label", "modified", result.getLabel());
}