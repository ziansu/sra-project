public static java.lang.String getFilePathPre(java.lang.String path) {
    java.nio.file.Path p = java.nio.file.Paths.get(path);
    java.lang.String filename = p.getFileName().toString();
    int i = filename.lastIndexOf('.');
    if ((i <= 0) || (((filename.length()) - i) > 5))
        return path;
    
    return p.resolveSibling(filename.substring(0, i)).toString();
}