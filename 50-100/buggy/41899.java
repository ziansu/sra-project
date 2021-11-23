public static byte[] getFileContent(java.lang.String filePath) {
    java.io.File file = new java.io.File(filePath);
    if (file.exists()) {
        try {
            return org.aspectj.util.FileUtil.readAsByteArray(file);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return null;
}