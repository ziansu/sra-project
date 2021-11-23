public static boolean isFile(java.lang.String path) {
    return path == null ? false : com.xiaoleilu.hutool.util.FileUtil.file(path).isFile();
}