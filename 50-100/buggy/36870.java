public static void writeTextFile(java.lang.String filePathOutput, java.lang.String content, boolean append) throws java.lang.Exception {
    try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(filePathOutput, append), "UTF-8"))) {
        thn.research.textutility.io.FileUtility.checkToCreateParentDir(filePathOutput);
        writer.write(content);
    }
}