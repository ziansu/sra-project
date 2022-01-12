private boolean loadSystemFromFile() {
    if (((getCsvFileReader().readStaffCsvFile(this)) && (getCsvFileReader().readUserCsvFile(this))) && (getCsvFileReader().readBooksCsvFile(this))) {
        java.lang.System.out.println("System loaded from files");
        return true;
    }
    return false;
}