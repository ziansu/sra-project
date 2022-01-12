@Conflict.Test
public void deleteParentFolderAtPC_renameSubFolderAtWEB() throws java.lang.Exception {
    java.lang.String parentFolder = "/Folder";
    java.lang.String subFolder = "/conflict22";
    fu.createFolder((parentFolder + subFolder), userId);
    Utils.WebUtil.refreshUntil90Seconds(1, driver);
    Utils.WebUtil.navigateToFolder(parentFolder, driver);
    Utils.WebUtil.refreshUntil90Seconds(1, driver);
    fu.deleteDirectory(parentFolder, userId);
    Utils.WebUtil.navigateToFolder(parentFolder, driver);
    Utils.WebUtil.rename(subFolder, (subFolder + "_New"), driver);
}