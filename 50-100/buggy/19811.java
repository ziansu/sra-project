private void cancelAction() {
    textFieldCash.setText("");
    textAreaComment.setText("");
    passwordFieldPassword.setText("");
    labelTransactionMethod.setText("SELECT!");
    isIOMethodSelected = false;
    buttonGroupIO.clearSelection();
    ioFrame.setVisible(false);
}