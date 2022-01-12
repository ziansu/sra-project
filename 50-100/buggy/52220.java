private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    ID = new java.lang.String(jPasswordField1.getPassword());
    int valid = dsd2016.api.DSD2016JAVA.validateUser(ID, picture, pkg423gui.TestClientLogin.outMsg);
    if (valid == 1) {
        setVisible(false);
        pkg423gui.userInfo i = new pkg423gui.userInfo();
        i.setVisible(true);
    }else {
        message = pkg423gui.TestClientLogin.outMsg.toString();
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(message));
    }
}