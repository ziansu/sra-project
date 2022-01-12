private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {
    if (firstRun) {
        firstRun = false;
        firstNameField.selectAll();
        firstNameField.setForeground(java.awt.Color.black);
    }else
        if (firstNameField.getText().equals(FIRST_NAME_FIELD)) {
            firstNameField.setText("");
            firstNameField.setForeground(java.awt.Color.black);
        }
    
}