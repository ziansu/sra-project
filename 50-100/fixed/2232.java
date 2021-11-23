public boolean isBadRequestPath(java.lang.String root, java.lang.String path) {
    java.lang.String tempPath;
    java.lang.String requestPath = "";
    tempPath = (rootPath) + path;
    java.io.File file = new java.io.File(tempPath);
    try {
        requestPath = file.getCanonicalPath();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    if (!(requestPath.contains(root))) {
        return false;
    }else {
        return true;
    }
}