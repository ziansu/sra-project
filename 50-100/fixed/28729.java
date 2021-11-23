@javafx.fxml.FXML
public void handleDay() {
    day = appointmentBookingApp.model.Day.values()[dayCombo.getSelectionModel().getSelectedIndex()];
    for (javafx.scene.control.CheckBox c : toggles)
        c.setSelected(false);
    
    for (int t : availability.getAvailability(day))
        toggles.get((t - (startHour))).setSelected(true);
    
}