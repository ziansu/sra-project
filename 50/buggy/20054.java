public void uploadCSVFile() {
    try {
        csvParser.parseCSV(file);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}