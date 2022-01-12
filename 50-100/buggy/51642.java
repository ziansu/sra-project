private java.util.Set<java.io.File> getFiles(java.io.File directory) {
    java.util.Set<java.io.File> files = new java.util.HashSet<>();
    files.add(directory);
    for (java.io.File file : directory.listFiles()) {
        if (file.isDirectory()) {
            files.addAll(getFiles(file));
        }else
            files.add(file);
        
    }
    return files;
}