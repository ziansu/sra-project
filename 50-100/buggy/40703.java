private boolean hasGzipFiles(java.util.Map<java.io.File, java.util.List<java.io.File>> files) {
    for (java.io.File file : files.keySet()) {
        java.util.List<java.io.File> filesToOpen = files.get(file);
        for (java.io.File fileToOpen : filesToOpen)
            if (isGzipFile(fileToOpen))
                return true;
            
        
    }
    return false;
}