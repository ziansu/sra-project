public static java.util.ArrayList<studyproject.API.Core.File.InfoList.FileInfoListEntry> removeFileNameAndGetRemovedFileInfoListEntries(studyproject.API.Core.File.Watcher.FileWatcherTreeNode fromNode, java.lang.String fileName) {
    studyproject.API.Core.File.Watcher.FileWatcherTreeNode removedNode = studyproject.API.Core.File.Watcher.FileWatcherTreeNode.removeFileName(fileName, fromNode);
    if (removedNode == null) {
        java.util.ArrayList<studyproject.API.Core.File.InfoList.FileInfoListEntry> empty = new java.util.ArrayList<studyproject.API.Core.File.InfoList.FileInfoListEntry>();
        return empty;
    }else {
        java.util.ArrayList<studyproject.API.Core.File.InfoList.FileInfoListEntry> entries = studyproject.API.Core.File.Watcher.FileWatcherTreeNode.getAllFileInfoListEntries(removedNode, null);
        return entries;
    }
}