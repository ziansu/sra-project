@org.junit.Test
public void testIsUniqueFolderIdentifier() throws eionet.meta.service.ServiceException {
    boolean result = vocabularyService.isUniqueVocabularyFolderIdentifier(1, "test", null);
    assertEquals("Is unique", true, result);
}