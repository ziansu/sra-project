static java.util.List<java.lang.String> getChildren(java.io.File dir, java.util.List<java.lang.String> filesInDir) throws java.io.IOException {
    java.io.File[] files = dir.listFiles();
    if (files != null)
        for (java.io.File file : files) {
            if (file.isFile())
                filesInDir.add(file.getAbsolutePath());
            else
                Utilities.getChildren(file, filesInDir);
            
        }
    
    return filesInDir;
}