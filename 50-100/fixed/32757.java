private void exitBActionPerformed(java.awt.event.ActionEvent evt) {
    if ((pewccapp.getPEWCClogic()) != null)
        pewccapp.getPEWCClogic().end();
    
    statusBar.setIndeterminate(false);
    startB.setEnabled(true);
    networkComboBox.setEnabled(true);
    joinPValue.setEnabled(true);
    stopButton.setEnabled(false);
    deactivate();
}