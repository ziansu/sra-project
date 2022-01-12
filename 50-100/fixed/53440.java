private com.taskboard.main.Response updateEditedDetailsToStorage(java.util.ArrayList<com.taskboard.main.Parameter> editedParameters, int index, boolean isEntryTypeChanged) {
    com.taskboard.main.Response responseForEdit = new com.taskboard.main.Response();
    try {
        _tempStorageManipulator.editTempStorage((index - 1), editedParameters, isEntryTypeChanged);
        java.lang.String entryName = getEntryName(index);
        setSuccessResponseForEdit(responseForEdit, entryName);
    } catch (java.io.IOException ex) {
        setFailureResponseForEdit(responseForEdit);
    }
    return responseForEdit;
}