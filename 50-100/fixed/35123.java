public void exportFiles() throws java.io.IOException {
    java.io.File fileExport = new java.io.File(exportFolder);
    java.lang.System.out.println(fileExport.getAbsolutePath());
    java.lang.System.out.println(sourcePath);
    if (!(fileExport.exists())) {
        fileExport.mkdirs();
    }
    java.io.File[] folderContent = new java.io.File(sourcePath).listFiles();
    if (folderContent != null) {
        for (java.io.File f : folderContent) {
            org.apache.commons.io.FileUtils.copyDirectoryToDirectory(f, fileExport);
        }
    }
}