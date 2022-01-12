public void onDownloadStart(java.lang.String url, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) {
    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
    android.content.pm.ResolveInfo ri = this.getPackageManager().resolveActivity(intent, 0);
    if (ri != null) {
        this.startActivity(intent);
    }
}