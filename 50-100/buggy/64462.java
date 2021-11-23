@Conflict.Test
public void deleteParentFolderAtPC_deleteSubFolderAtWEB() throws java.lang.Exception {
    java.lang.String parentFolder = "/Folder";
    java.lang.String subFolder = "/conflict24";
    fu.createFolder((parentFolder + subFolder), userId);
    Utils.WebUtil.refreshUntil90Seconds(1, driver);
    fu.deleteDirectory(parentFolder, userId);
    Utils.WebUtil.navigateToFolder(parentFolder, driver);
    Utils.WebUtil.deleteItem(subFolder, driver);
    java.lang.Thread.sleep((10 * 1000));
}