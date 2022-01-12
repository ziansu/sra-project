private java.lang.String getFolderContentPath(java.util.List<org.alfresco.consulting.indexer.webscripts.BreadCrumb> breadCrumbs, java.lang.String folderName) {
    java.lang.String folderContentPath = breadCrumbs.get(((breadCrumbs.size()) - 1)).getUrl();
    folderName = folderName.replace(" ", spaceCorrectEncode);
    if ((breadCrumbs.size()) > 1) {
        folderContentPath += "%2F" + folderName;
    }
    return folderContentPath;
}