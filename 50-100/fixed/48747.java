@java.lang.Override
public com.google.gerrit.extensions.common.WebLinkInfo getFileHistoryWebLink(java.lang.String projectName, java.lang.String revision, java.lang.String fileName) {
    if ((fileHistory) != null) {
        return link(fileHistory.replace("project", encode(projectName)).replace("branch", encode(revision)).replace("file", encode(fileName)).toString());
    }
    return null;
}