public void showProgressDialog() {
    if ((progressDialog) == null) {
        progressDialog = new android.app.ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.loading));
        progressDialog.setIndeterminate(true);
    }
    progressDialog.show();
}