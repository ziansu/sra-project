@org.junit.Test
public void testUpdateFolder() throws eionet.meta.service.ServiceException {
    eionet.meta.dao.domain.Folder folder = vocabularyService.getFolder(2);
    folder.setIdentifier("new");
    folder.setLabel("new");
    vocabularyService.updateFolder(folder);
    folder = vocabularyService.getFolder(2);
    assertEquals("Modified identifier", "new", folder.getIdentifier());
    assertEquals("Modified label", "new", folder.getLabel());
}