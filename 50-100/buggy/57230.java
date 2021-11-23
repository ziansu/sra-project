@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFrame parentFrame = new javax.swing.JFrame();
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    fileChooser.setDialogTitle("Import Names.");
    fileChooser.setCurrentDirectory(new java.io.File(java.lang.System.getProperty("user.dir")));
    int userSelection = fileChooser.showSaveDialog(parentFrame);
    if (userSelection == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        loadFile(fileChooser.getSelectedFile().getName());
    }
}