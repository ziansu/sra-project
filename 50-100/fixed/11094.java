public boolean determineSize(long recordsReadInCurrentPass, java.lang.Integer lengthVarFieldsInCurrentRecord) throws java.io.IOException {
    if (readPage()) {
        return true;
    }
    if (processPageData(((int) (recordsReadInCurrentPass)))) {
        return true;
    }
    lengthVarFieldsInCurrentRecord = -1;
    return checkVectorCapacityReached();
}