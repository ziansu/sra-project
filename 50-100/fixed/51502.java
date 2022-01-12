private void showProgressDialog(boolean canDShowDialog) {
    if ((progressDialog) == null) {
        progressDialog = new android.app.ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setMessage("Loading . . . ");
    }
    if (!canDShowDialog) {
        if (((progressDialog) != null) && (progressDialog.isShowing())) {
            progressDialog.dismiss();
        }
    }else {
        progressDialog.show();
    }
}