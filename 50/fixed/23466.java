public static java.lang.String readTxtFile(java.lang.String filePath, java.lang.String encoding) {
    final java.lang.String file = filePath + ".txt";
    return com.wangzhe.util.FileUtils.readTxtFile(new java.io.File(file), encoding);
}