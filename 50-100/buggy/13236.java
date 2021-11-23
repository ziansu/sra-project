protected void openFileAction() {
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    int returnVal = fc.showOpenDialog(frmSubtitleshifter);
    if (returnVal == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fc.getSelectedFile();
        try {
            app.openFile(file.getAbsolutePath());
        } catch (java.lang.Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(frmSubtitleshifter, ("Error occured while opening the file.\nError: " + (ex.getMessage())), "Cannot open file", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        reloadFile();
    }
}