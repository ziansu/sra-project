@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    pDialog = new android.app.ProgressDialog(getContext());
    pDialog.setMessage("Loading recent articles...");
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(false);
    pDialog.show();
}