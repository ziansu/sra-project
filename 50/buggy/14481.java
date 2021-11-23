@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    pDialog = new android.app.ProgressDialog(this);
    pDialog.setMessage("Updating Location..");
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(true);
    pDialog.show();
}