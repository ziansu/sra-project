@org.junit.Test
public void getValuedConceptsTest() throws eionet.meta.service.ServiceException {
    org.junit.Assert.assertEquals("Concept size is not 4", vocabularyService.getConceptsWithElementValue(1, 1).size(), 4);
    org.junit.Assert.assertEquals("Concept size is not 1", vocabularyService.getConceptsWithElementValue(5, 1).size(), 1);
    org.junit.Assert.assertEquals("Concept size is not 0", vocabularyService.getConceptsWithElementValue(1, 2).size(), 0);
    org.junit.Assert.assertEquals("Concept size is not 0", vocabularyService.getConceptsWithElementValue(2, 1).size(), 0);
}