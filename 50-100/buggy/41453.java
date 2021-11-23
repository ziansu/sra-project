private java.lang.String readFile(java.nio.file.Path path) throws java.io.IOException {
    java.lang.String outputString = "";
    Storage.storageLogger.info(("Accessing save file at " + (path.toString())));
    java.io.BufferedReader reader = java.nio.file.Files.newBufferedReader(path);
    while (reader.ready()) {
        outputString += (reader.readLine()) + "\n";
    } 
    reader.close();
    return outputString;
}