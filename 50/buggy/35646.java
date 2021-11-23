private void advancedButtonActionPerformed(java.awt.event.ActionEvent evt) {
    artifactStates = dialog.display();
    wizPanel.setFinish(areArtifactsSelected());
}