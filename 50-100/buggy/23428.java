@java.lang.Override
public void showLoading(java.lang.String message) {
    if ((mProgressDialog) == null) {
        mProgressDialog = new android.app.ProgressDialog(this);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(true);
    }
    mProgressDialog.setMessage(message);
    mProgressDialog.show();
}