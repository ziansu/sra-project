@javafx.fxml.FXML
public void searchAppointment() {
    java.time.LocalDate date = datePicker.getValue();
    tableView.setItems(resourceAppointment.searchAppointment(date));
    tableView.refresh();
}