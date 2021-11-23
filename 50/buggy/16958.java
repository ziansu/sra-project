static void writeToFile(java.lang.String path, java.lang.String text) throws java.io.FileNotFoundException {
    try (java.io.PrintWriter pw = new java.io.PrintWriter(path)) {
        pw.print(text);
    }
}