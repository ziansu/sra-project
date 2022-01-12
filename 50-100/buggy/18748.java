@java.lang.Override
public void run() {
    dialog.setIndeterminate(false);
    java.lang.String total_mb = java.lang.String.format("%.2g%n", ((this.downloadSize) / (java.lang.Math.pow(2, 20)))).trim();
    dialog.update(this.lastDownloadedFile.getName(), total_mb, total_mb);
    dialog.setProgress(100);
    this.C.sendBroadcast(new android.content.Intent(com.nebula.kernelupdater.Tools.EVENT_DOWNLOADEDFILE_EXISTS));
}