public void retrieveSalesInfo() {
    java.io.File salesInfoTargetFile = new java.io.File("C:\\temp\\garagetotals.txt");
    fw.setInputFile(salesInfoTargetFile);
    fw.readFile();
}