public void logRequest(java.lang.String request) throws java.io.IOException {
    bjohnson.FileIO.appendToFile(filePath, request);
}