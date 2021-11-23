public static java.io.File zip(java.io.File srcFile) throws java.io.IOException {
    java.io.File zipFile = com.xiaoleilu.hutool.util.FileUtil.file(srcFile.getParentFile(), ((com.xiaoleilu.hutool.util.FileUtil.mainName(srcFile)) + ".zip"));
    com.xiaoleilu.hutool.util.ZipUtil.zip(zipFile, false, srcFile);
    return zipFile;
}