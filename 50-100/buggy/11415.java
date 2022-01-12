public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(Editor.isScenerio())) {
        if ((browseFile()) != null) {
            Editor.currentFile = browseFile();
            javax.swing.JOptionPane.showMessageDialog(null, (("Scenerio file '" + (Editor.currentFile)) + "' is selected"));
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "No file selected");
        }
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "Scenerio file already exists");
    }
}