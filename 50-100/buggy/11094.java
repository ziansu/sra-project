public boolean determineSize(long recordsReadInCurrentPass, java.lang.Integer lengthVarFieldsInCurrentRecord) throws java.io.IOException {
    boolean doneReading = readPage();
    if (doneReading) {
        return true;
    }
    doneReading = processPageData(((int) (recordsReadInCurrentPass)));
    if (doneReading) {
        return true;
    }
    lengthVarFieldsInCurrentRecord = -1;
    doneReading = checkVectorCapacityReached();
    if (doneReading) {
        return true;
    }
    return false;
}