@javafx.fxml.FXML
protected void gotoConfig3(javafx.event.ActionEvent event) throws java.lang.Exception {
    saveSettings(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    LoadSceneXml("/fxml/config3.fxml");
    dpfmanager.MainApp.gui.loadFormats(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    dpfmanager.MainApp.gui.loadOutput(dpfmanager.MainApp.thestage.getScene(), dpfmanager.MainApp.config);
    checkChanged(null);
}