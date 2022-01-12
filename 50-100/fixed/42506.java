@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    fc.setCurrentDirectory(new java.io.File("C:/Scouting_Data"));
    fc.setFileFilter(fileFilter);
    int fileRes = fc.showOpenDialog(null);
    if (fileRes == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File selectedFile = fc.getSelectedFile();
        loadDirectory = selectedFile.getAbsolutePath();
        if ((loadDirectory) != null) {
            Main.readSpreadsheet.read(loadDirectory);
        }
    }
}