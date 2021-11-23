public studyproject.API.Core.File.Watcher.FileWatcherTreeNode getNodeByFileName(java.lang.String fullFileName) {
    return getNodeBySubDirs(studyproject.API.Core.File.Watcher.FileWatcherTreeNode.convertFileNameToStringList(fullFileName));
}