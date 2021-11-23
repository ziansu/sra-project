private void selectNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setMultiSelectionEnabled(false);
    switch (fileChooser.showOpenDialog(this)) {
        case javax.swing.JFileChooser.APPROVE_OPTION :
            java.io.File file = fileChooser.getSelectedFile();
            newDirDisplay.setText(file.getPath());
            newFileDirectory = file.getParent();
            newFileName = file.getName();
            break;
    }
}