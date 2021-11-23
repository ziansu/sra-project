@org.junit.Test
public void testGetFolders() throws eionet.meta.service.ServiceException {
    java.util.List<eionet.meta.dao.domain.Folder> result = vocabularyService.getFolders("testUser", 1);
    assertEquals("Folders size", 6, result.size());
    eionet.meta.dao.domain.Folder folderCommon = null;
    for (eionet.meta.dao.domain.Folder folder : result) {
        if ("common".equals(folder.getIdentifier())) {
            folderCommon = folder;
        }
    }
    assertEquals("Items size", 3, folderCommon.getItems().size());
}