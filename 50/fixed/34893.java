public static void clearFile(java.io.File file) throws java.io.IOException {
    file.delete();
    file.createNewFile();
}