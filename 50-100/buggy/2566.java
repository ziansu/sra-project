private void zipFolder(java.lang.String srcFolder, java.lang.String destZipFile) throws java.lang.Exception {
    java.util.zip.ZipOutputStream zip = null;
    java.io.FileOutputStream fileWriter = null;
    fileWriter = new java.io.FileOutputStream(destZipFile);
    zip = new java.util.zip.ZipOutputStream(fileWriter);
    addFolderToZip("", srcFolder, zip);
    zip.flush();
    zip.close();
}