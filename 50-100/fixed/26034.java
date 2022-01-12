@org.junit.Test
public void testDeleteFolder() throws eionet.meta.service.ServiceException {
    vocabularyService.deleteFolder(2);
    java.lang.Exception exception = null;
    try {
        vocabularyService.getFolder(2);
        fail("Expected vocabulary not found exception");
    } catch (eionet.meta.service.ServiceException e) {
        exception = e;
    }
    assertNotNull("Expected exception", exception);
}