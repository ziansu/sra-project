public static void zipWith(java.io.File directory, java.io.File zipFile, java.util.List<java.io.File> includes) throws java.io.IOException {
    java.io.FileOutputStream fos = null;
    try {
        fos = new java.io.FileOutputStream(zipFile);
        com.centurylink.mdw.util.file.ZipHelper.writeZipWith(directory, fos, includes);
    } finally {
        if (fos != null)
            fos.close();
        
    }
}