@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    if (anyEmployeeSelector.isSelected()) {
        employeeField.setDisable(true);
        updateApptTimes();
    }else {
        employeeField.setDisable(false);
    }
}