private java.lang.String[] readFile(java.lang.String filePath) throws java.io.FileNotFoundException, java.io.IOException {
    java.lang.String fileLine;
    java.lang.String[] compiledText = null;
    int x = 0;
    try (java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
        while ((fileLine = bufferedReader.readLine()) != null) {
            compiledText[x] = fileLine + "\n";
            x++;
        } 
    }
    return compiledText;
}