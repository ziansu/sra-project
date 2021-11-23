@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    loadingInternetDialog = new android.app.ProgressDialog(this);
    loadingInternetDialog.setMessage("Loading...");
    loadingInternetDialog.show();
}