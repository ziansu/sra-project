public void actionPerformed(java.awt.event.ActionEvent e) {
    if (Editor.isScenerio()) {
        Editor.appendToFile((("\n/~sound:" + (browseFile())) + "\n"));
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "No scenerio file");
    }
}