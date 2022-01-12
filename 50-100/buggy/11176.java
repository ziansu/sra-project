@java.lang.Override
protected void onPreExecute() {
    ((android.app.Activity) (context)).getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    this.loadingDialog.setIndeterminate(true);
    this.loadingDialog.setCancelable(false);
    this.loadingDialog.setTitle(getString(R.string.settings_downloadHDSpots_button_label));
    this.loadingDialog.setMessage((("Downloading: " + (lstToDownload)) + "..."));
    this.loadingDialog.show();
}