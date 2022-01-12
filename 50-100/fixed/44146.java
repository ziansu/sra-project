@org.junit.Test
public void getValuedConceptsTest() throws eionet.meta.service.ServiceException {
    assertEquals("Concept size is not 4", vocabularyService.getConceptsWithElementValue(1, 1).size(), 4);
    assertEquals("Concept size is not 1", vocabularyService.getConceptsWithElementValue(5, 1).size(), 1);
    assertEquals("Concept size is not 0", vocabularyService.getConceptsWithElementValue(1, 2).size(), 0);
    assertEquals("Concept size is not 0", vocabularyService.getConceptsWithElementValue(2, 1).size(), 0);
}