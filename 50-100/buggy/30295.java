private com.taskboard.main.Response processDeleteByIndex() {
    com.taskboard.main.Response ResponseForDeleteByIndex = new com.taskboard.main.Response();
    java.lang.String index = getDetailFromParameter(getIndexParameter());
    int indexValue = java.lang.Integer.parseInt(index);
    int tempStorageIndex = indexValue - 1;
    try {
        _tempStorageManipulator.deleteFromTempStorage(tempStorageIndex);
        java.lang.String entryName = getEntryName(indexValue);
        setSuccessResponseForDeleteByIndex(ResponseForDeleteByIndex, entryName);
    } catch (java.io.IOException ex) {
        setFailureResponseForDelete(ResponseForDeleteByIndex);
    }
    return ResponseForDeleteByIndex;
}