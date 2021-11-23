public static void toFile(java.lang.String fileName, java.lang.String content) throws java.io.IOException {
    java.io.File file = new java.io.File("/users/mkyong/filename.txt");
    if (!(file.exists())) {
        file.createNewFile();
    }
    java.io.FileWriter fw = new java.io.FileWriter(file.getAbsoluteFile());
    java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
    bw.write(content);
    bw.close();
}