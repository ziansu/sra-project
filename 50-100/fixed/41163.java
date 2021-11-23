private void generateButton() {
    if ((TextField.getText().trim().equals("")) || ((ComboBox.getSelectedIndex()) < 0)) {
        GenerateReportButton.setEnabled(false);
    }else {
        GenerateReportButton.setEnabled(true);
    }
}