@java.lang.Override
public void initialize(java.net.URL location, java.util.ResourceBundle resources) {
    title.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<assignment.models.Course, java.lang.String>("title"));
    credit.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<assignment.models.Course, java.lang.Integer>("credit"));
    tuitionPerCredit.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<assignment.models.Course, java.lang.Integer>("tuitionPerCredit"));
    table.setItems(assignment.controller.RegistrationFxController.data);
}