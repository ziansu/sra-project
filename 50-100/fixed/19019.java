public static void archive(java.io.File srcFile, boolean gzip, boolean includeDir) throws java.lang.Exception {
    java.lang.String ext = (gzip) ? ".tar.gz" : ".tar";
    java.io.File destPath = org.apache.commons.io.FileUtils.getFile(srcFile.getParent(), ((srcFile.getName()) + ext));
    hacky.ArchiveUtils.archive(srcFile, destPath, gzip, includeDir);
}