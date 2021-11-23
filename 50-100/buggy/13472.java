public static java.util.Collection<java.io.File> listFiles(java.io.File[] directories, org.apache.commons.io.filefilter.IOFileFilter fileFilter, org.apache.commons.io.filefilter.IOFileFilter dirFilter) {
    java.util.Collection<java.io.File> files = new java.util.ArrayList<>();
    for (java.io.File directory : directories) {
        java.util.Collection<java.io.File> filesInDirectory = org.apache.commons.io.FileUtils.listFiles(directory, fileFilter, dirFilter);
        files.addAll(filesInDirectory);
    }
    return files;
}