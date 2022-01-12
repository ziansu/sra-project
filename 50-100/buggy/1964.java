@java.lang.Override
public void approveSelection() {
    java.io.File selectedFile = getSelectedFile();
    if ((selectedFile.exists()) && ((getDialogType()) == (javax.swing.JFileChooser.SAVE_DIALOG))) {
        int result = javax.swing.JOptionPane.showConfirmDialog(this, "Do you want to overwrite?", "File already exists", javax.swing.JOptionPane.YES_NO_OPTION);
        if (result == (javax.swing.JOptionPane.YES_OPTION)) {
            super.approveSelection();
        }else {
            cancelSelection();
        }
    }
    super.approveSelection();
}