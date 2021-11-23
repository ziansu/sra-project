static void writeToFile(java.lang.String path, java.lang.String text) throws java.io.IOException {
    try (java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.FileWriter(path))) {
        out.write(text);
    }
}