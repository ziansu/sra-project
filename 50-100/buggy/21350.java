@javafx.fxml.FXML
private void comboPickedCourse(javafx.event.ActionEvent event) {
    attendance.BE.Subject selected = cmbStudClassSelect.getSelectionModel().getSelectedItem();
    setLabels(tblStudents.getSelectionModel().getSelectedItem().getId(), tblClasses.getSelectionModel().getSelectedItem().getId(), selected.getId());
}