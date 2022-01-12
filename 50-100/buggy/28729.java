@javafx.fxml.FXML
public void handleDay() {
    day = appointmentBookingApp.model.Day.values()[dayCombo.getSelectionModel().getSelectedIndex()];
    for (javafx.scene.control.CheckBox c : toggles) {
        boolean checked = false;
        for (int t : availability.getAvailability(day))
            if ((toggles.get((t - (startHour)))) == c)
                checked = true;
            
        
        c.setSelected(checked);
    }
}