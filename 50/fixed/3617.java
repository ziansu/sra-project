@javafx.fxml.FXML
void eventualDatePickerOnHiding(javafx.event.Event event) {
    if ((eventualDatePicker.getValue()) != null) {
        datePickerOnHiding(eventualDatePicker, chkbEventual);
    }
}