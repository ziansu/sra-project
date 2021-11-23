@org.junit.Test
public void testIsFolderEmpty() throws eionet.meta.service.ServiceException {
    org.junit.Assert.assertFalse("Folder empty", vocabularyService.isFolderEmpty(1));
}