public java.lang.Boolean isFile(java.lang.String link) {
    if (link.startsWith("ftp")) {
        return true;
    }else
        if (link.endsWith(".zip")) {
            return true;
        }else
            if (link.endsWith(".gz")) {
                return true;
            }else
                if (link.toLowerCase().contains("download")) {
                    return true;
                }
            
        
    
    return false;
}