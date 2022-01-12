@javafx.fxml.FXML
private void btnEmployeOnClick(javafx.event.ActionEvent event) throws java.io.IOException {
    employeeActive();
    javafx.fxml.FXMLLoader fXMLLoader = new javafx.fxml.FXMLLoader();
    fXMLLoader.load(getClass().getResource("/view/Employe.fxml").openStream());
    controller.user.EmployeController employeController = fXMLLoader.getController();
    employeController.bpContent.getStylesheets().add("/style/MainStyle.css");
    employeController.btnViewEmployeeOnAction(event);
    javafx.scene.layout.AnchorPane acPane = fXMLLoader.getRoot();
    acContent.getChildren().clear();
    acContent.getChildren().add(acPane);
}