private void jEditUsrAcctActionPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    UserInterface.UserAccountFuncs.EditUsrAcct edituacct = new UserInterface.UserAccountFuncs.EditUsrAcct();
    edituacct.setLocationRelativeTo(null);
    edituacct.requestFocus();
}