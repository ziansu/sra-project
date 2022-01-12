protected java.util.ArrayList<java.lang.String> listFilesInDir(java.lang.String dir) {
    java.util.ArrayList<java.lang.String> levelFiles = new java.util.ArrayList<java.lang.String>();
    java.io.File resourceFolder = new java.io.File(dir);
    java.io.File[] files = resourceFolder.listFiles();
    if (files != null) {
        for (java.io.File file : files) {
            if (file.isFile()) {
                levelFiles.add(file.getName());
            }
        }
    }
    return levelFiles;
}