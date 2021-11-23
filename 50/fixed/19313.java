private void initalizeReader() {
    try {
        FiletoRead = new java.io.FileReader(generateNextPath(false));
        bufRead = new java.io.BufferedReader(FiletoRead);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}