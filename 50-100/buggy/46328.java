public static boolean cp(final java.lang.String sourceFile, final java.lang.String destFile) {
    boolean action = false;
    java.io.File srcFile = new java.io.File(sourceFile);
    java.io.File desFile = new java.io.File(destFile);
    try {
        org.apache.commons.io.FileUtils.copyFile(srcFile, desFile);
        action = true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    srcFile = null;
    desFile = null;
    return action;
}