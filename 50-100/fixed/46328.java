public static void cp(final java.lang.String sourceFile, final java.lang.String destFile) throws java.io.IOException, java.lang.Exception {
    java.io.File srcFile = new java.io.File(sourceFile);
    java.io.File desFile = new java.io.File(destFile);
    org.apache.commons.io.FileUtils.copyFile(srcFile, desFile);
    srcFile = null;
    desFile = null;
}