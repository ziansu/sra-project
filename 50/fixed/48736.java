private void dismissDialog() {
    if (((progressDialog) != null) && (progressDialog.isShowing())) {
        progressDialog.dismiss();
    }
}