public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(Editor.isScenerio())) {
        java.lang.String file = browseFile();
        if (file != null) {
            Editor.currentFile = file;
            javax.swing.JOptionPane.showMessageDialog(null, (("Scenerio file '" + (Editor.currentFile)) + "' is selected"));
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "No file selected");
        }
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "Scenerio file already exists");
    }
}