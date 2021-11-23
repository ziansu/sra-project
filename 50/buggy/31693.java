@org.junit.Test
public void testGetFolder() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.Folder result = vocabularyService.getFolder(1);
    org.junit.Assert.assertNotNull("Folder", result);
}