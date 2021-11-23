public boolean get(java.net.URI source, java.io.File dest, java.lang.String title) throws java.io.IOException {
    progressBar = new javax.swing.JProgressBar(javax.swing.JProgressBar.HORIZONTAL, 0, 100);
    dialog = new org.helioviewer.jhv.io.FileDownloader.StandAloneDialog(title);
    dialog.setVisible(true);
    boolean result = downloadFile(source, dest);
    dialog.dispose();
    return result;
}