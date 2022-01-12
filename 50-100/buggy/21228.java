private com.taskboard.main.Response updateEditedDetailsToStorage(java.util.ArrayList<com.taskboard.main.Parameter> editedParameters, int index, boolean isEntryTypeChanged) {
    com.taskboard.main.Response responseForEdit = new com.taskboard.main.Response();
    try {
        int tempStorageIndex = index - 1;
        _tempStorageManipulator.editTempStorage(tempStorageIndex, editedParameters, isEntryTypeChanged);
        java.lang.String entryName = getEntryName(index);
        setSuccessResponseForEdit(responseForEdit, entryName);
    } catch (java.io.IOException ex) {
        setFailureResponseForEdit(responseForEdit);
    }
    return responseForEdit;
}