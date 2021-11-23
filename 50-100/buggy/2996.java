public void OpenAction() {
    java.lang.System.out.println("Opened");
    fc = new javax.swing.JFileChooser(AppMain.directory);
    int op = fc.showOpenDialog(Parent);
    if (op == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fc.getSelectedFile();
        SetDirectoryFromFile(file);
        Parent.fireFileEvent(new FileEvent(this, file, FileEvent.OPEN_OPTION));
    }
}