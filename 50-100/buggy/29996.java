public java.lang.String getObjectIDFromPath(java.lang.String path) {
    java.lang.String objID = "";
    if (path.startsWith(OBJECT_PATH_PREFIX))
        path = path.substring(OBJECT_PATH_PREFIX.length());
    
    int firstSlash = path.indexOf('/');
    int secondSlash = path.indexOf('/', (firstSlash + 1));
    if (secondSlash != (-1)) {
        objID = path.substring(0, secondSlash);
    }else {
        objID = path;
    }
    return objID;
}