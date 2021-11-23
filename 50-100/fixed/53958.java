@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (jb.isEnabled()) {
        imageFile = Chreator.UIModule.UIHandler.getInstance(null).getFileDirectoryByDialog(javax.swing.JFileChooser.FILES_ONLY);
        if (((imageFile) != null) && (!(graphicAreaPanel.setBoardImage(imageFile)))) {
            javax.swing.JOptionPane.showMessageDialog(Chreator.UIModule.UIHandler.getMainWindow(), "<html><center>Failed to read image file.<br>File type is not supported, file content is corrupted or file path cannot be accessed.</html>", "Failed to read image file", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}