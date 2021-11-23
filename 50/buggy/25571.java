@java.lang.Override
public void writeToFile(java.lang.String filename, java.lang.String content) {
    try {
        super.writeToFile(filename, content);
    } catch (java.io.FileNotFoundException fe) {
        java.lang.System.err.println("File location not valid.");
    }
}