public void refreshGallery(java.io.File file) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    mediaScanIntent.setData(android.net.Uri.fromFile(file));
    sendBroadcast(mediaScanIntent);
}