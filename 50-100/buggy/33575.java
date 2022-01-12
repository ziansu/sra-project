public void actionPerformed(java.awt.event.ActionEvent e) {
    if (Editor.isScenerio()) {
        javax.swing.JFileChooser browseFile = new javax.swing.JFileChooser();
        browseFile.showOpenDialog(frame);
        Editor.appendToFile((("\n/~sound:" + (browseFile())) + "\n"));
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "No scenerio file");
    }
}