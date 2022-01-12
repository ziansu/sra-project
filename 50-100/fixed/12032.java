public void menuItemFileSaveToDataBase_onAction() {
    application.util.DataBaseConnection dataBaseConncetion = new application.util.DataBaseConnection();
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Database");
    alert.setHeaderText(dataBaseConncetion.SaveCallendarEntries(mainApp.getCallendarEntriesObservableList()));
    alert.showAndWait();
}