public java.lang.String browseActionPerformed(javax.swing.JFrame parentFrame) {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("Select Project Location");
    chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if ((chooser.showOpenDialog(parentFrame)) == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        projectPathString = chooser.getSelectedFile().getAbsolutePath();
        PixelPlotterMain.status.setText(("Existing project opened at " + (projectPathString)));
    }
    return projectPathString;
}