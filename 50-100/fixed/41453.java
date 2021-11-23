private java.lang.String readFile(java.nio.file.Path path) throws java.io.IOException {
    java.lang.String outputString = "";
    java.io.BufferedReader reader = java.nio.file.Files.newBufferedReader(path);
    while (reader.ready()) {
        outputString += (reader.readLine()) + "\n";
    } 
    reader.close();
    return outputString;
}