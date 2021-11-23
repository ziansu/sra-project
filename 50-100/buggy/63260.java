public void readFile(java.lang.String directory, java.lang.String fileName) {
    try {
        tblData = csvHandler.readCSV(directory, fileName);
    } catch (java.io.IOException e) {
        if (logErrors) {
            com.jeremy.Logging.getInstance().log(java.util.logging.Level.SEVERE, (("Error reading file: " + directory) + fileName), e);
        }
    }
}