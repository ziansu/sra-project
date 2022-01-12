public void actionPerformed(java.awt.event.ActionEvent arg0) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setCurrentDirectory(new java.io.File("."));
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        selectedFile = fileChooser.getSelectedFile();
    }
    fileNameField.setText(selectedFile.getName());
}