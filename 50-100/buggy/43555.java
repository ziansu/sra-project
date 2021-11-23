private void jButtonLaunchBatchActionPerformed(java.awt.event.ActionEvent evt) {
    jButtonLaunchBatch.setEnabled(false);
    jButtonCancelBatch.setEnabled(true);
    setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
    org.healtex.gui.RunBatch runBatch = new org.healtex.gui.RunBatch(fileList, jTextFieldOutputDir.getText(), jProgressBarBatchProgress, jButtonLaunchBatch, jButtonCancelBatch);
    runBatch.addPropertyChangeListener(runBatch);
    runBatch.execute();
}