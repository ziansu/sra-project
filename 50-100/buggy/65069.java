private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    int result = fileChooser.showOpenDialog(this);
    if (result == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        url = fileChooser.getSelectedFile().getAbsolutePath();
        textUrl.setText(url);
    }
}