private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String user = userName.getText();
    java.lang.String pass1 = new java.lang.String(password1.getPassword());
    java.lang.String pass2 = new java.lang.String(password2.getPassword());
    boolean success = validateData(user, pass1, pass2);
    if (!success) {
        success = validateData(user, pass1, pass2);
    }
    java.lang.String newAcctData = (user + " ") + pass1;
    connectNewUser(newAcctData);
}