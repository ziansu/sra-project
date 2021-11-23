@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    myLoadingDialog = new android.app.ProgressDialog(this);
    myLoadingDialog.setMessage("Loading");
    myLoadingDialog.setIndeterminate(false);
    myLoadingDialog.setCancelable(false);
    myLoadingDialog.show();
}