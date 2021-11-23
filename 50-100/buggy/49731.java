private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (pewccapp.getPEWCClogic().isAlive()) {
        pewccapp.getPEWCClogic().end();
        stopcalculus(null);
        networkComboBox.setEnabled(true);
        joinPValue.setEnabled(true);
        startB.setEnabled(true);
        stopButton.setEnabled(false);
    }
}