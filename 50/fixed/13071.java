@org.junit.Test
public void testGetFoldersSorting() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.Folder> result = vocabularyService.getFolders(null, null);
    assertEquals("The first folder", "xxx", result.get(0).getLabel());
}