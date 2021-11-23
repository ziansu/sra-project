public static java.io.File createFileIfNotExist(java.lang.String fileName) {
    java.io.File file = new java.io.File(fileName);
    boolean success = false;
    if (!(file.exists())) {
        try {
            success = file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return success ? file : null;
}