@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog = new android.app.ProgressDialog(getActivity());
    progressDialog.setMessage("Loading all messages...");
    progressDialog.setCancelable(false);
    progressDialog.show();
}