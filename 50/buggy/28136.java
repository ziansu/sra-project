public void saveEntityData() {
    if ((changedData) || (confDialog.changedData())) {
        saveContextualInfo();
        changedData = false;
        confDialog.setChangedData();
    }
}