private java.lang.Boolean checkNewEmployeeTextFields() {
    try {
        int bsn = java.lang.Integer.parseInt(EmployeeAddBasic_BsnTextfield.getText());
        java.lang.String name = EmployeeAddBasic_NameTextfield.getText();
        java.lang.String surname = EmployeeAddBasic_SurnameTextfield.getText();
        if ((name.isEmpty()) || (surname.isEmpty())) {
            return false;
        }else {
            return true;
        }
    } catch (java.lang.NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Bsn contains only numbers");
    }
    return false;
}