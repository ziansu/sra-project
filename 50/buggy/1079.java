private void createCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    frontend.AddCustomerScreen screen = new frontend.AddCustomerScreen(this);
    screen.setVisible(true);
}