public java.lang.Boolean isFile(java.lang.String link) {
    if (link.startsWith("ftp")) {
        return true;
    }
    if (link.endsWith(".zip"))
        return true;
    
    if (link.endsWith(".gz"))
        return true;
    
    if (link.toLowerCase().contains("download"))
        return true;
    
    return false;
}