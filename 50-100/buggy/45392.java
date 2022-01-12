private static java.lang.String fixPath(java.lang.String path) {
    java.lang.String localPath = new java.lang.String(path);
    if (localPath.startsWith(fulcrum.xml.XMLConstants.FORWARD_SLASH)) {
        localPath = localPath.substring(1);
    }
    if (localPath.startsWith(fulcrum.xml.XMLConstants.FORWARD_SLASH_DBL)) {
        localPath = localPath.substring(2);
    }
    return localPath;
}