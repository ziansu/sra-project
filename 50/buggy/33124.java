@org.junit.Test
public void testRelationalElement() throws java.lang.Exception {
    org.junit.Assert.assertTrue(vocabularyService.isReferenceElement(6));
    org.junit.Assert.assertTrue((!(vocabularyService.isReferenceElement(1))));
}