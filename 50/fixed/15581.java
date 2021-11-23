public java.io.File save(java.io.File directory) {
    final java.io.File suiteFile = new java.io.File(directory, "testng.xml");
    saveSuiteContent(suiteFile);
    return suiteFile;
}