public void logRequest(java.lang.String request) throws java.io.IOException {
    java.lang.System.out.println(filePath);
    bjohnson.FileIO.appendToFile(filePath, request);
}