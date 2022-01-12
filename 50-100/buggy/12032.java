public void menuItemFileSaveToDataBase_onAction() {
    application.util.DataBaseConnection dataBaseConncetion = new application.util.DataBaseConnection("eu-cdbr-azure-west-d.cloudapp.net", "bazadanychorganizer", "b49f86d8da8665", "3c8f720c");
    dataBaseConncetion.SaveCallendarEntries(mainApp.getCallendarEntriesObservableList());
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Database");
    alert.setHeaderText("Data successfully saved to database");
    alert.showAndWait();
}