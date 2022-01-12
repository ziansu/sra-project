public void readFile(java.io.File csvFile) throws java.io.IOException {
    try {
        tblData = csvHandler.readCSV(csvFile);
    } catch (java.io.IOException e) {
        if (logErrors) {
            com.jeremy.Logging.getInstance().log(java.util.logging.Level.SEVERE, ("Error reading file: " + csvFile), e);
        }
        throw e;
    }
}