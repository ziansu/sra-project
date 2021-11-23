public static void saveMap(java.lang.String fileName, java.lang.String[] lines) {
    fileName = fileName + ".txt";
    java.io.PrintWriter outputFile = null;
    try {
        outputFile = new java.io.PrintWriter(("res/mapfiles/" + fileName));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    for (java.lang.String line : lines) {
        outputFile.println(line);
    }
    outputFile.close();
}