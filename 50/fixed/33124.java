@org.junit.Test
public void testRelationalElement() throws java.lang.Exception {
    assertTrue(vocabularyService.isReferenceElement(6));
    assertTrue((!(vocabularyService.isReferenceElement(1))));
}