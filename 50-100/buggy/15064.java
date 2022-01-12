@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    pDialog = new android.app.ProgressDialog(this);
    pDialog.setMessage("Downloading for the first time. File Size: 2.1mb");
    pDialog.setIndeterminate(false);
    pDialog.setMax(100);
    pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    pDialog.setCancelable(true);
    pDialog.show();
}