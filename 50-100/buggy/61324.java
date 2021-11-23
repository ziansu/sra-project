public static void setPath() {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    chooser.showOpenDialog(null);
    chen.mfmaker.io.IOManager.path = chooser.getSelectedFile();
    if (!(chen.mfmaker.io.IOManager.path.isDirectory())) {
        javax.swing.JOptionPane.showMessageDialog(null, "打开的不是目录！", "错误", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    chen.mfmaker.io.IOManager.IOMap = chen.mfmaker.io.IOManager.getMap();
}