private void openFileDlg() {
    int res;
    res = saveConfirmation();
    if (res != (javax.swing.JOptionPane.CANCEL_OPTION)) {
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter(((((interfaces.IConsts.APPNAME) + " file (*.") + (interfaces.IConsts.FILE_EXT)) + ")"));
        chooser.setFileFilter(filter);
        res = chooser.showOpenDialog(this);
        openFile(chooser.getSelectedFile().getAbsolutePath());
    }
}