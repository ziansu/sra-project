public java.io.File openFile(java.awt.Component father) {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    if ((br.edu.ifsp.util.Config.getInstance()) != null) {
        chooser.setCurrentDirectory(new java.io.File(br.edu.ifsp.util.Config.getInstance().getDirectory()));
    }
    if ((chooser.showSaveDialog(father)) == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        return chooser.getSelectedFile();
    }
    return null;
}