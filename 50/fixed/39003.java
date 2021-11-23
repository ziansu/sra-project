public java.util.ArrayList<java.lang.String> run() {
    setEditInformation();
    getTaskIdOfTaskToBeEdited();
    editTask();
    updateCategory();
    saveExternal();
    updateGuiDisplay();
    setOutput();
    return output;
}