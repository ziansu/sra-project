public org.silverpeas.core.contribution.content.form.DataRecord[] getCurrentProcessList() throws org.silverpeas.processmanager.ProcessManagerException {
    if ((currentProcessList) == null) {
        return resetCurrentProcessList();
    }else {
        return currentProcessList;
    }
}