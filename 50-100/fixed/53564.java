@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser("./");
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "bmp"));
    fileChooser.setMultiSelectionEnabled(false);
    fileChooser.showOpenDialog(null);
    if ((fileChooser.getSelectedFile()) != null)
        backgroundEdit.setText(fileChooser.getSelectedFile().getAbsolutePath());
    
}