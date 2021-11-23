@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent me) {
    javax.swing.JFileChooser fileopen = new javax.swing.JFileChooser();
    int ret = fileopen.showDialog(null, "Select file");
    if (ret == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fileopen.getSelectedFile();
        sendFile(file);
    }
}