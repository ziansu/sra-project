public static java.io.File createFileIfNotExist(java.lang.String fileName) {
    java.io.File file = new java.io.File(fileName);
    if (!(file.exists())) {
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return file;
}