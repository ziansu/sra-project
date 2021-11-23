public studyproject.API.Core.File.Watcher.FileWatcherTreeNode getNodeByFileName(java.lang.String fullFileName) {
    java.lang.System.out.println(("getNodeByFileName: " + fullFileName));
    return getNodeBySubDirs(studyproject.API.Core.File.Watcher.FileWatcherTreeNode.convertFileNameToStringList(fullFileName));
}