private java.lang.String parseCSVfile() {
    java.lang.String line;
    java.lang.String appendedLines = "";
    try (java.util.Scanner scanner = new java.util.Scanner(new java.io.FileReader("database.csv"))) {
        while (scanner.hasNextLine()) {
            line = (scanner.nextLine()) + "\n";
            appendedLines += line;
        } 
        return appendedLines.trim();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}