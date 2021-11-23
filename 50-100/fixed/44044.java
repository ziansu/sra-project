public static void overwriteFile(java.lang.String content, java.lang.String fileName) {
    java.io.File file = cn.j1angvei.castk2.util.FileUtil.createFileIfNotExist(fileName);
    try {
        assert file != null;
        org.apache.commons.io.FileUtils.writeStringToFile(file, content, java.nio.charset.Charset.defaultCharset(), false);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}