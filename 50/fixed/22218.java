@org.junit.Test
public void vocabularyBindingExistsTest() throws eionet.meta.service.ServiceException {
    assertTrue(vocabularyService.vocabularyHasDataElementBinding(1, 1));
    assertTrue((!(vocabularyService.vocabularyHasDataElementBinding(1, 2))));
}