public void showProgress() {
    if ((mProgressDialog) == null) {
        mProgressDialog = new android.app.ProgressDialog(this, R.style.custom_dialog);
        mProgressDialog.setCancelable(false);
        mProgressDialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
    }
    mProgressDialog.show();
    mProgressDialog.setContentView(R.layout.progress_circle);
}