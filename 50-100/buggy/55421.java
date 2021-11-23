private void datePickerOnHiding(com.jfoenix.controls.JFXDatePicker datePicker, com.jfoenix.controls.JFXCheckBox chkBox) {
    if ((datePicker.getValue().isBefore(java.time.LocalDate.now())) || (datePicker.getValue().isEqual(java.time.LocalDate.now()))) {
        txtfMessage.setVisible(true);
        txtfMessage.setText("Please select a future date.");
        urgentDatePicker.setValue(null);
    }else {
        txtfMessage.setVisible(false);
        chkBox.setSelected(true);
    }
}