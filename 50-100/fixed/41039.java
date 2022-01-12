private boolean correctEmailFormat() {
    clearFieldsColors();
    if (!(textFieldEmail.getText().matches(gui.SignUpPanel.EMAIL_PATTERN))) {
        textFieldEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 5, 1, 1, new java.awt.Color(255, 51, 51)));
        textFieldEmail.requestFocus();
        javax.swing.JOptionPane.showMessageDialog(sharedFrame, "The email dont have the correct format.", "Invalid email format", javax.swing.JOptionPane.WARNING_MESSAGE);
        return false;
    }
    return true;
}