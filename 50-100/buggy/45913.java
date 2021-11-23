public static void appendFile(java.lang.String content, java.lang.String fileName) {
    java.io.File file = cn.j1angvei.castk2.util.FileUtil.createFileIfNotExist(fileName);
    try {
        org.apache.commons.io.FileUtils.write(file, content, java.nio.charset.Charset.defaultCharset(), true);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}