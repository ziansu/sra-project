@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    if (intent != null) {
        final java.lang.String action = intent.getAction();
        if (com.nick.instajet.DownloaderService.ACTION_URL_DOWNLOAD.equals(action)) {
            final java.lang.String fullUrl = intent.getStringExtra(com.nick.instajet.DownloaderService.PARAM_FULL_URL);
            this.fullUrl = fullUrl;
            handleDownloadUrl(fullUrl);
        }
    }
}