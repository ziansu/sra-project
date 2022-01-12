private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    proxy = new javaxmlproject.ProxyAuthenticator(jUserField.getText(), new java.lang.String(jPasswordField1.getPassword()));
    proxy.initProxy();
    new GraphicPackage.MainFrame().setVisible(true);
    this.setVisible(false);
}