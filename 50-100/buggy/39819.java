@javafx.fxml.FXML
protected void gotoConfig4(javafx.event.ActionEvent event) throws java.lang.Exception {
    saveSettings(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    LoadSceneXml("/fxml/config4.fxml");
    dpfmanager.MainApp.gui.getAutofixes(dpfmanager.MainApp.thestage.getScene());
    if (dpfmanager.MainApp.editingConfig) {
        dpfmanager.MainApp.gui.loadFixes(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    }
}