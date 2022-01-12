public void zipDir(java.lang.String dirName, java.lang.String nameZipFile) throws java.io.IOException {
    java.util.zip.ZipOutputStream zip = null;
    java.io.FileOutputStream fW = null;
    try {
        fW = new java.io.FileOutputStream(nameZipFile);
        zip = new java.util.zip.ZipOutputStream(fW);
        addFolderToZip("", dirName, zip);
    } finally {
        if (zip != null) {
            zip.close();
        }
        if (fW != null) {
            fW.close();
        }
    }
}