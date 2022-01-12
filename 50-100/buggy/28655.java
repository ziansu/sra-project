private java.io.File getSelectedFile(java.lang.String title) {
    java.io.File selectedFile = null;
    fileChooser.setCurrentDirectory(this.currentDir);
    fileChooser.setDialogTitle(title);
    int userChoice = fileChooser.showOpenDialog(com.sandy.jnmaker.util.ObjectRepository.getMainFrame());
    if (userChoice == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        this.currentDir = fileChooser.getCurrentDirectory();
        selectedFile = fileChooser.getSelectedFile();
    }
    return selectedFile;
}