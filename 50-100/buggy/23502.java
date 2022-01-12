private void enableColorComboBoxes() {
    pickupComboBox.setEnabled(((manifestFormatComboBox.getSelectedItem()) == (Setup.STANDARD_FORMAT)));
    dropComboBox.setEnabled(((manifestFormatComboBox.getSelectedItem()) == (Setup.STANDARD_FORMAT)));
    localComboBox.setEnabled(((manifestFormatComboBox.getSelectedItem()) == (Setup.STANDARD_FORMAT)));
}