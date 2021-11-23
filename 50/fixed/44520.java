private void writeFile(java.lang.String fileName, java.lang.String content) throws java.io.IOException {
    java.io.File testFile = new java.io.File(fileName);
    try (java.io.FileWriter writer = new java.io.FileWriter(testFile)) {
        writer.write(content);
    }
}