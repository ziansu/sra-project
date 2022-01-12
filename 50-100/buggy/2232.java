public boolean isBadRequestPath(java.lang.String root, java.lang.String path) {
    java.lang.String tempPath;
    java.lang.String requestPath = "";
    tempPath = (rootPath) + path;
    request.File file = new request.File(tempPath);
    try {
        requestPath = file.getCanonicalPath();
    } catch (request.IOException e) {
        e.printStackTrace();
    }
    if (!(requestPath.contains(root))) {
        return false;
    }else {
        return true;
    }
}