private studyproject.API.Core.File.Watcher.FileWatcherTreeNode getNodeBySubDirs(java.util.List<java.lang.String> subDirsList) {
    if (children.containsKey(subDirsList.get(0))) {
        studyproject.API.Core.File.Watcher.FileWatcherTreeNode child = children.get(subDirsList.get(0));
        if ((subDirsList.size()) == 1) {
            return child;
        }else {
            subDirsList.remove(0);
            return child.getNodeBySubDirs(subDirsList);
        }
    }else {
    }
    return null;
}