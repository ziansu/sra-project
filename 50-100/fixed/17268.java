public static java.io.File zip(java.lang.String srcPath, java.lang.String zipPath, boolean withSrcDir) throws java.io.IOException {
    java.io.File srcFile = com.xiaoleilu.hutool.util.FileUtil.file(srcPath);
    java.io.File zipFile = com.xiaoleilu.hutool.util.FileUtil.file(zipPath);
    com.xiaoleilu.hutool.util.ZipUtil.zip(zipFile, withSrcDir, srcFile);
    return zipFile;
}