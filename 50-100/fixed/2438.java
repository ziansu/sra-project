private void addNewDataModel(java.lang.String xmlData) throws java.lang.Exception {
    if ((xmlData != null) && (!(xmlData.isEmpty()))) {
        com.jidesoft.app.framework.gui.filebased.FileBasedApplication app = ((com.jidesoft.app.framework.gui.filebased.FileBasedApplication) (getApplication()));
        com.jidesoft.app.framework.file.FileDataModel data = ((com.jidesoft.app.framework.file.FileDataModel) (app.newData("xml")));
        data.setData(xmlData);
        data.setDirty(true);
    }
}