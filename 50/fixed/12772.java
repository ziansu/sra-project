@javafx.fxml.FXML
private void logoutButtonPressed(javafx.event.ActionEvent __) {
    try {
        worker.logout();
    } catch (SMExceptions.SMException e) {
        EmployeeGui.EmployeeGuiExeptionHandler.handle(e);
    }
    GuiUtils.AbstractApplicationScreen.setScene("/EmployeeLoginScreen/EmployeeLoginScreen.fxml");
}