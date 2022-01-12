@java.lang.Override
protected void okPressed() {
    if ((!(text.getText().isEmpty())) && (text.getText().equals(text2.getText()))) {
        password = text.getText();
        super.okPressed();
    }else {
        org.eclipse.jface.dialogs.MessageDialog.openWarning(this.getShell(), Messages.PasswordDialog_3, Messages.PasswordDialog_4);
    }
}