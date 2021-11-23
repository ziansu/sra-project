private void checkOnFiles() {
    java.io.File directory = new java.io.File("src/main/data/savedXML/");
    java.io.File[] listOfFiles = directory.listFiles();
    if ((listOfFiles != null) && ((listOfFiles.length) > 0)) {
        foundFiles(listOfFiles);
    }else {
        runClearedProject();
    }
}