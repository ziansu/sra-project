private java.util.List<java.lang.String> fileToList(java.io.File file) throws java.io.IOException {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    try (java.io.BufferedReader fileReader = new java.io.BufferedReader(new java.io.FileReader(file.getAbsolutePath()))) {
        java.lang.String line;
        while (fileReader.ready()) {
            line = fileReader.readLine();
            result.add(line);
        } 
    }
    return result;
}