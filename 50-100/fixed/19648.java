private static java.util.List<java.lang.String> getFileNamesInDirectory(java.lang.String studyDirectory) {
    java.io.File folder = new java.io.File(studyDirectory);
    java.io.File[] listOfFiles = folder.listFiles();
    java.util.List<java.lang.String> possibleRawFiles = new java.util.ArrayList<>();
    for (int i = 0; i < (listOfFiles.length); i++) {
        possibleRawFiles.add(listOfFiles[i].getName());
    }
    return possibleRawFiles;
}