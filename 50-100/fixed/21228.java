private com.taskboard.main.Response updateEditedDetailsToStorage(java.util.ArrayList<com.taskboard.main.Parameter> editedParameters, int index, boolean isEntryTypeChanged) {
    com.taskboard.main.Response responseForEdit = new com.taskboard.main.Response();
    try {
        int tempStorageIndex = index - 1;
        java.lang.String entryName = getEntryName(index);
        _tempStorageManipulator.editTempStorage(tempStorageIndex, editedParameters, isEntryTypeChanged);
        setSuccessResponseForEdit(responseForEdit, entryName);
    } catch (java.io.IOException ex) {
        setFailureResponseForEdit(responseForEdit);
    }
    return responseForEdit;
}