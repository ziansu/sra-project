public static void removeFilesAndFolder(java.lang.String... paths) throws java.io.IOException {
    for (java.lang.String path : paths) {
        java.io.File f = new java.io.File(path);
        if ((f != null) && (f.exists())) {
            org.apache.commons.io.FileUtils.forceDelete(f);
        }
    }
}