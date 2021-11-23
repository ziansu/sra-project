public void extract() throws java.io.IOException {
    java.util.zip.ZipFile zip = new java.util.zip.ZipFile(this.archiveName);
    java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(this.archiveName));
    java.util.zip.ZipEntry entry;
    while ((entry = zis.getNextEntry()) != null) {
        this.archiveMap.put(entry.getName(), zip.getInputStream(entry));
    } 
    zip.close();
    zis.close();
}