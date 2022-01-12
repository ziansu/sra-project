public java.util.List<org.apache.tools.zip.ZipEntry> getZipContent(java.io.File file) throws java.io.IOException {
    org.apache.tools.zip.ZipFile zipFile = new org.apache.tools.zip.ZipFile(file);
    java.util.ArrayList<org.apache.tools.zip.ZipEntry> zipFileList = new java.util.ArrayList<org.apache.tools.zip.ZipEntry>();
    java.util.Enumeration<? extends org.apache.tools.zip.ZipEntry> entries = zipFile.getEntries();
    while (entries.hasMoreElements()) {
        org.apache.tools.zip.ZipEntry entry = entries.nextElement();
        zipFileList.add(entry);
        java.lang.System.out.println(entry.getName());
    } 
    return zipFileList;
}