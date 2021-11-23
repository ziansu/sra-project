private static java.lang.String fixPath(java.lang.String path) {
    java.lang.String localPath = null;
    if (path.startsWith(fulcrum.xml.XMLConstants.FORWARD_SLASH)) {
        localPath = path.substring(1);
    }else
        if (path.startsWith(fulcrum.xml.XMLConstants.FORWARD_SLASH_DBL)) {
            localPath = path.substring(2);
        }else {
            return path;
        }
    
    return localPath;
}