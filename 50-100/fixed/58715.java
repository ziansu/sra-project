public void watchFile(java.lang.String path, java.lang.Boolean watchParentFolderForNewFiles, java.lang.String virtualRoot) throws java.lang.Exception {
    studyproject.API.Core.File.InfoList.FileInfoListEntry newFile = addFileToLists(path, virtualRoot);
    java.lang.String parentDirectory = (newFile.parentDirectory) + "/";
    if (!(watchedInternalDirectories.contains(parentDirectory))) {
        watchedInternalDirectories.add(parentDirectory);
        watchDirectory(parentDirectory, watchParentFolderForNewFiles, virtualRoot);
    }
}