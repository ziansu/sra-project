public static void saveFile(java.lang.String data, java.lang.String filePath) throws java.io.IOException {
    java.io.File file = new java.io.File(filePath, "rw");
    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
    fileOutputStream.write(data.getBytes());
}