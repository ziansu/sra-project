protected void openFileAction() {
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    int returnVal = fc.showOpenDialog(frmSubtitleshifter);
    if (returnVal == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fc.getSelectedFile();
        reloadFile(file.getAbsolutePath());
    }
}