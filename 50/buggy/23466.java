public static java.lang.String readTxtFile(java.lang.String filePath, java.lang.String encoding) {
    return com.wangzhe.util.FileUtils.readTxtFile(new java.io.File((filePath + ".txt")), encoding);
}