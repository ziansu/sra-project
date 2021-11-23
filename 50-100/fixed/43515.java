public void readFile(java.lang.String fileName) throws java.io.IOException {
    try {
        tblData = csvHandler.readCSV(fileName);
    } catch (java.io.IOException e) {
        if (logErrors) {
            com.jeremy.Logging.getInstance().log(java.util.logging.Level.SEVERE, ("Error reading file: " + fileName), e);
        }
        throw e;
    }
}