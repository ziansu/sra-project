public void downloadGenome(java.lang.String id, java.lang.String displayName) {
    com.xl.net.genomes.GenomeDownloader genomeDownload;
    com.xl.display.dialog.ProgressDialog progressDialog;
    genomeDownload = new com.xl.net.genomes.GenomeDownloader();
    genomeDownload.addProgressListener(this);
    progressDialog = new com.xl.display.dialog.ProgressDialog(this, ("Downloading genome: " + displayName));
    genomeDownload.addProgressListener(progressDialog);
    genomeDownload.downloadGenome(id, true);
    progressDialog.requestFocus();
    progressDialog.setDefaultCloseOperation(ProgressDialog.DISPOSE_ON_CLOSE);
}