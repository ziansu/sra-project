private java.lang.String readFile() throws java.io.FileNotFoundException, java.io.IOException {
    java.util.List<java.lang.String> lines = com.google.common.io.CharStreams.readLines(new java.io.FileReader(file));
    java.lang.String allLines = "";
    for (java.lang.String line : lines) {
        allLines += line + "\n";
    }
    return allLines.substring(0, allLines.length());
}