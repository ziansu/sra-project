public java.util.List<java.lang.String> getFileNames(java.lang.String path) {
    java.io.File folder = new java.io.File(path);
    java.io.File[] files = folder.listFiles();
    java.util.List<java.lang.String> fileNames = new java.util.ArrayList<>();
    for (java.io.File file : files) {
        fileNames.add(file.getName());
    }
    return fileNames;
}