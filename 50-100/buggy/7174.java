private void comboBoxFieldActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.System.out.println(("here" + (comboBoxStartToSearch)));
    java.lang.String searchColName = comboBoxField.getSelectedItem().toString();
    searchValue = comboBoxValue.getSelectedItem().toString();
    java.lang.String tabName = getSelectedTabName();
    updateComboList(searchColName, tabName);
    comboBoxValue.setSelectedItem(searchValue);
    comboBoxStartToSearch = true;
}