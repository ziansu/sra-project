public boolean addUser() {
    if (pwField.getText().equals(pwConfirmField.getText())) {
        animalkeeping.technicalAdministration.DatabaseUser newUser = new animalkeeping.technicalAdministration.DatabaseUser(usernameField.getText(), pwField.getText(), userClassComboBox.getValue());
        return true;
    }else {
        java.lang.System.out.println("Passwords do not match!");
        return false;
    }
}