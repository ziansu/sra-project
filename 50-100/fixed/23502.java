private void enableColorComboBoxes() {
    pickupComboBox.setEnabled(manifestFormatComboBox.getSelectedItem().equals(Setup.STANDARD_FORMAT));
    dropComboBox.setEnabled(manifestFormatComboBox.getSelectedItem().equals(Setup.STANDARD_FORMAT));
    localComboBox.setEnabled(manifestFormatComboBox.getSelectedItem().equals(Setup.STANDARD_FORMAT));
}