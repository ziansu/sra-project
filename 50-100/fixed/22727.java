public java.lang.String getObjectExtraInfoFromPath(java.lang.String path) {
    java.lang.String objectID = getObjectIDFromPath(path);
    if (path.startsWith(OBJECT_PATH_PREFIX))
        path = path.substring(OBJECT_PATH_PREFIX.length());
    
    if ((objectID != null) && (path.startsWith(objectID)))
        path = path.substring(objectID.length());
    
    if (path.startsWith("/"))
        path = path.substring(1);
    
    return path;
}