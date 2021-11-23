public java.io.File findFileInPaths(java.lang.String fileName, java.lang.Iterable<java.io.File> paths) {
    for (java.io.File p : paths) {
        java.io.File f = _getSourceFileFromPath(fileName, p);
        if (f != null)
            return f;
        
    }
    return edu.rice.cs.util.FileOps.NULL_FILE;
}