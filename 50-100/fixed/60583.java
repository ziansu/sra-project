public java.lang.String getLineByNumber(int lineID) throws java.io.FileNotFoundException, java.io.IOException {
    java.io.File theFile = new java.io.File(file.getFilePath().getPathAsString());
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(theFile));
    java.lang.String line;
    int x = 0;
    while ((line = reader.readLine()) != null) {
        if (x == lineID) {
            return line;
        }
        x++;
    } 
    return null;
}