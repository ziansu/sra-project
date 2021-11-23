private void selectOldButtonActionPerformed(java.awt.event.ActionEvent evt) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    fileChooser.setMultiSelectionEnabled(false);
    switch (fileChooser.showOpenDialog(this)) {
        case javax.swing.JFileChooser.APPROVE_OPTION :
            oldDirDisplay.setText(fileChooser.getSelectedFile().getPath());
            oldFileDirectory = fileChooser.getSelectedFile().getPath();
    }
}