public synchronized java.io.File createNamedDirectory(java.lang.String p) {
    if (noMoreFolders)
        return null;
    
    java.io.File dir = new java.io.File(p);
    if (!(dir.exists()))
        if (!(dir.mkdirs()))
            return null;
        
    
    return dir;
}