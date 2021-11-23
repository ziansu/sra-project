private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(rallydevice.Navigator.isNumeric(jTextField1.getText())))
        jTextField1.setText("0");
    
    checkAndUpdate();
}