@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    try {
        if (((progressDialog) != null) && (!(progressDialog.isShowing()))) {
            progressDialog.setMessage(getString(R.string.uploading));
            progressDialog.show();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}