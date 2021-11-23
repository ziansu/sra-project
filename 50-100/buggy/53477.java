public void saveAI() {
    java.lang.String filename = ((((((filePath) + "/") + (basename)) + (getTimestamp())) + "_") + ((fileCount)++)) + ".ai";
    saveAI(filename, shapes, allColors);
}