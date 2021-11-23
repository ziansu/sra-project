private void initalizeReader() {
    try {
        FiletoRead = new java.io.FileReader(generateNextPath());
        bufRead = new java.io.BufferedReader(FiletoRead);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}