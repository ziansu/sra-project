private void fileOpenClass() {
    int returnVal = this.fc.showOpenDialog(this);
    if (returnVal == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = this.fc.getSelectedFile();
        this.file = file.getAbsolutePath();
        try {
            this.lop.open(file.toURI().toURL());
        } catch (java.net.MalformedURLException e) {
        }
    }
}