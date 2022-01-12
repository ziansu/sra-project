private void button5MousePressed(java.awt.event.MouseEvent event) {
    javax.swing.filechooser.FileFilter filter = new javax.swing.filechooser.FileNameExtensionFilter(null, "txt");
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.setDialogTitle("Specify a file to load");
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setFileFilter(filter);
    int response = chooser.showOpenDialog(null);
    if (response == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        com.xigbclutchix.trove.TroveUtils.addModsFromTextFile(chooser.getSelectedFile());
    }
}