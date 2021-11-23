private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {
    fileOp.saveFile(records);
    this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    java.lang.System.exit(0);
}