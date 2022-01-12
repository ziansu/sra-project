protected java.lang.String normalizeFullPath(java.lang.String fullPath) {
    fullPath = java.nio.file.Paths.get(fullPath).toString();
    fullPath = fullPath.replaceAll("\\\\", "/");
    while (fullPath.startsWith(java.io.File.separator))
        fullPath = fullPath.substring(1, fullPath.length());
    
    if (fullPath.endsWith(java.io.File.separator))
        fullPath = fullPath.substring(0, ((fullPath.length()) - 1));
    
    return fullPath;
}