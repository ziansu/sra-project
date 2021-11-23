@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressDialog.setMessage("Loading");
    progressDialog.show();
}