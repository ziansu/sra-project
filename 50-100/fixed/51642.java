private java.util.Set<java.io.File> getFiles(java.io.File directory) {
    java.util.Set<java.io.File> files = new java.util.HashSet<>();
    for (java.io.File file : directory.listFiles()) {
        files.add(file);
        if (file.isDirectory()) {
            files.addAll(getFiles(file));
        }
    }
    return files;
}