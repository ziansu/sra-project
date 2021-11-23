private void saveAsSelectedFile() {
    com.microsoftopentechnologies.intellij.helpers.storage.BlobFile fileSelection = getFileSelection();
    assert fileSelection != null;
    javax.swing.JFileChooser jFileChooser = new javax.swing.JFileChooser(new java.io.File(fileSelection.getName()));
    jFileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
    int saveDialog = jFileChooser.showSaveDialog(this.mainPanel);
    if (saveDialog == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        downloadSelectedFile(jFileChooser.getSelectedFile(), false);
    }
}