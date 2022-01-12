java.io.File getSelectedPropertyFile() throws java.io.FileNotFoundException {
    javax.swing.JFileChooser fileOpen = new javax.swing.JFileChooser();
    javax.swing.filechooser.FileNameExtensionFilter filter = new javax.swing.filechooser.FileNameExtensionFilter("*.properties", "properties");
    fileOpen.setAcceptAllFileFilterUsed(false);
    fileOpen.setFileFilter(filter);
    fileOpen.setDialogTitle(Log.OPEN_PROPERTY_FILE);
    int result = fileOpen.showOpenDialog(this);
    if (result == (javax.swing.JFileChooser.CANCEL_OPTION))
        throw new java.io.FileNotFoundException();
    
    return fileOpen.getSelectedFile();
}