public void createProgressDialog(java.lang.String mediaName) {
    if ((progressDialog) == null) {
        return ;
    }
    progressDialog.setTitle(((getString(R.string.notification_download_title_pending)) + mediaName));
    progressDialog.setMessage(getString(R.string.notification_download_pending));
    progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
    progressDialog.setProgress(0);
    progressDialog.setMax(100);
    progressDialog.setProgressNumberFormat(null);
    progressDialog.show();
}