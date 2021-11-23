private void jbAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JFrame frame = new javax.swing.JFrame();
    Views.AddCustomer add = new Views.AddCustomer();
    add.setVisible(true);
    frame.setSize(500, 400);
    frame.add(add);
    frame.setVisible(true);
}