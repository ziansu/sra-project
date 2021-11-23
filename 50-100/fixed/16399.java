@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progressDialog.setCancelable(false);
    progressDialog.setMessage("Loading image");
    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progressDialog.setProgress(0);
    progressDialog.setMax(100);
    progressDialog.show();
}