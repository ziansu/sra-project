@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    pDialog = new android.app.ProgressDialog(this);
    pDialog.setMessage(getString(R.string.load_data));
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(false);
    pDialog.show();
}