private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {
    database.Contact toBeRegister = new database.Contact(this.firstNameText.getText(), this.middleNameText.getText(), this.lastNameText.getText(), this.telephoneText.getText(), this.emailText.getText(), database.CurrentUser.getID());
    functionality.NewTenantRegister NTR = new functionality.NewTenantRegister();
    NTR.register(toBeRegister);
    this.dispose();
}