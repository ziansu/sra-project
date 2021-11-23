protected java.lang.String normalizeFullPath(java.lang.String fullPath) {
    fullPath = java.nio.file.Paths.get(fullPath).toString();
    fullPath = fullPath.replaceAll("\\\\", "/");
    while (fullPath.startsWith("/"))
        fullPath = fullPath.substring(1, fullPath.length());
    
    if (fullPath.endsWith("/"))
        fullPath = fullPath.substring(0, ((fullPath.length()) - 1));
    
    return fullPath;
}