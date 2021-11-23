public void saveAI() {
    java.lang.String filename = (((((((filePath) + "/") + (basename)) + "_") + (getTimestamp())) + "_") + ((fileCount)++)) + ".ai";
    saveAI(filename, shapes, allColors);
}