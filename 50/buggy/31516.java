@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog = new android.app.ProgressDialog(activity.getBaseContext());
    progressDialog.setTitle("LOADING");
    progressDialog.show();
}