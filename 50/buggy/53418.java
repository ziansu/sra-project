@org.junit.Test
public void testFolderRetrieve() throws com.kloudless.exception.KloudlessException {
    com.kloudless.model.Folder folderInfo = com.kloudless.model.Folder.retrieve("fL2E=", "4", null);
    java.lang.System.out.println(folderInfo);
}